import AST.ASTBuilder;
import AST.Program;
import gen.DartLexer;
import gen.DartParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. تحميل كود لغة Dart
            String dartCode;
            File testFile = new File("test.dart");

            if (args.length > 0) {
                File argFile = new File(args[0]);
                if (argFile.exists()) {
                    dartCode = Files.readString(argFile.toPath());
                    System.out.println("[INFO] Loading Dart code from: " + argFile.getAbsolutePath());
                } else {
                    dartCode = args[0];
                    System.out.println("[INFO] Parsing input string from arguments.");
                }
            } else if (testFile.exists()) {
                dartCode = Files.readString(testFile.toPath());
                System.out.println("[INFO] Loading Dart code from: " + testFile.getAbsolutePath());
            } else {
                dartCode = """
                    void main() {
                        int x = 10;
                        int y = 20;
                        print(x + y);
                    }
                    """;
                System.out.println("[INFO] Using default sample Dart code.");
            }

            System.out.println("\n========== DART SOURCE CODE ==========");
            System.out.println(dartCode);
            System.out.println("======================================\n");

            // 2. مرحلة التحليل المعجمي (Lexer - Tokenization)
            System.out.println("========== [1] LEXER TOKENS ==========");
            CharStream input = CharStreams.fromString(dartCode);
            DartLexer lexer = new DartLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            tokenStream.fill();

            for (Token token : tokenStream.getTokens()) {
                if (token.getType() == Token.EOF) {
                    System.out.printf("[EOF] Line %d, Col %d%n", token.getLine(), token.getCharPositionInLine());
                    continue;
                }
                String tokenName = DartLexer.VOCABULARY.getSymbolicName(token.getType());
                System.out.printf("Token: %-22s | Text: %-25s | Line: %d, Col: %d%n",
                        tokenName, token.getText().replace("\n", "\\n").replace("\r", "\\r"),
                        token.getLine(), token.getCharPositionInLine());
            }

            // 3. مرحلة التحليل النحوي (Parser - Syntax Analysis)
            System.out.println("\n========== [2] PARSER (SYNTAX TREE) ==========");
            tokenStream.seek(0);
            DartParser parser = new DartParser(tokenStream);

            // بناء شجرة الإعراب (Parse Tree)
            ParseTree tree = parser.program();

            System.out.println("\n--- Parse Tree LISP Representation ---");
            System.out.println(tree.toStringTree(parser));

            // 4. بناء وطباعة كائنات شجرة البناء المجردة (AST Generation)
            System.out.println("\n========== [3] ABSTRACT SYNTAX TREE (AST) ==========");
            ASTBuilder astBuilder = new ASTBuilder();
            Program ast = (Program) astBuilder.visit(tree);
            System.out.println(ast);

            // 5. رسم الشجرة بيانياً عبر واجهة رسومية (GUI TreeViewer)
            System.out.println("\n========== [4] DRAWING TREE (GUI) ==========");
            System.out.println("[INFO] Opening TreeViewer GUI Window...");

            SwingUtilities.invokeLater(() -> {
                try {
                    JFrame frame = new JFrame("Dart Syntax Tree Viewer - شجرة الإعراب للغة دارت");
                    JPanel panel = new JPanel(new BorderLayout());

                    List<String> ruleNames = Arrays.asList(parser.getRuleNames());
                    TreeViewer viewer = new TreeViewer(ruleNames, tree);
                    viewer.setScale(1.25); // تكبير الشجرة لسهولة القراءة
                    viewer.setFont(new Font("Segoe UI", Font.PLAIN, 12));

                    panel.add(viewer, BorderLayout.CENTER);

                    JScrollPane scrollPane = new JScrollPane(panel);
                    scrollPane.getVerticalScrollBar().setUnitIncrement(16);
                    scrollPane.getHorizontalScrollBar().setUnitIncrement(16);

                    frame.getContentPane().add(scrollPane);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(1100, 750);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    System.err.println("[ERROR] Failed to display GUI: " + e.getMessage());
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}