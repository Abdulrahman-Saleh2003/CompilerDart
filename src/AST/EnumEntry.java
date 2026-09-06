package AST;

import java.util.ArrayList;
import java.util.List;

public class EnumEntry extends ASTNode {
    public String name;
    public List<Argument> arguments;

    public EnumEntry(String name, List<Argument> arguments) {
        this.name = name;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
    }

    public EnumEntry(String name) {
        this(name, new ArrayList<>());
    }

    @Override
    public String toString() {
        return "\nEnumEntry{" +
                "name='" + name + '\'' +
                (!arguments.isEmpty() ? ", arguments=" + arguments : "") +
                '}';
    }
}
