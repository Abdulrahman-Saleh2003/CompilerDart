# CompilerDart

مترجم ومحلل لغوي ونحوي للغة **Dart** مبني بلغة **Java** باستخدام مكتبة **ANTLR4**، مع بناء شجرة البناء المجردة (**AST**) ورسم شجرة الإعراب (**Parse Tree**) بيانياً عبر واجهة مستخدم رسومية (GUI).

---

## مميزات المشروع

- **محلل معجمي شامل (Lexer)**:
  - دعم كامل للكلمات المفتاحية في Dart: `class`, `mixin`, `enum`, `extension`, `import`, `var`, `final`, `const`, `late`, `if`, `else`, `for`, `while`, `switch`, `try`, `catch`, `async`, `await`, وغيرها.
  - دعم جميع المعاملات: الحسابية، المنطقية، عمليات البت (Bitwise)، ومعاملات الـ Null-Safety (`?`, `??`, `?.`, `!..`, `!`).
  - دعم معاملات الـ Cascade (`..`, `?..`) ومعاملات النشر Spread (`...`, `...?`).
  - دعم الأرقام الصحيحة والعشرية والست عشرية، والنصوص العادية والمتعددة الأسطر والخام.

- **محلل نحوي شامل (Parser)**:
  - يدعم الكلاسات بمعدلاتها (`abstract`, `sealed`, `base`, `interface`, `final`).
  - يدعم الوراثة المتعددة والواجهات والـ Mixins (`extends`, `with`, `implements`).
  - يدعم البواني المسماة (Named Constructors) والـ Initializer Lists و `super(...)` و `this.field`.
  - يدعم الـ Generics، والـ Getters/Setters، وإعادة تعريف العمليات (Operator Overloading).
  - يدعم التحكم بالتدفق: `for-in`, `await for`, `switch-case-when`, `try-on-catch-finally`, `yield/yield*`.
  - يدعم ميزات المجموعات المتقدمة: Spread Elements و Collection-if و Collection-for.

- **شجرة البناء المجردة (AST)**:
  - أكثر من 70 كلاس متخصص داخل `package AST;` يمثل كل مفهوم وعقدة في شجرة البرنامج.
  - جميع الكلاسات ترث من الكلاس الأساسي `ASTNode`.
  - توفير كلاس المحول والزائر `ASTBuilder` لتحويل شجرة ANTLR تلقائياً إلى كائنات الـ AST مع دوال `toString()` منسقة وقابلة للقراءة.

- **رسم الشجرة الرسومية (GUI TreeViewer)**:
  - نافذة رسومية تفاعلية تعرض شجرة الإعراب رسومياً مع إمكانية التكبير والتمرير.

---

## هيكلية المشروع

```
CompelerDart/
│
├── lib/
│   └── antlr-4.13.2-complete.jar   # مكتبة ANTLR4 وأدوات الـ GUI
│
├── src/
│   ├── AST/                        # كلاسات شجرة البناء المجردة (AST)
│   │   ├── ASTNode.java            # الكلاس الأساسي المشترك
│   │   ├── ASTBuilder.java         # محول الشجرة التلقائي
│   │   ├── Program.java            # العقدة الجذرية
│   │   └── ...                     # أكثر من 70 كلاس للـ AST
│   │
│   ├── gen/                        # الكود المولد من ANTLR (Lexer & Parser)
│   │   ├── DartLexer.java
│   │   ├── DartParser.java
│   │   └── ...
│   │
│   ├── DartLexer.g4                # قواعد المحلل المعجمي
│   ├── DartParser.g4               # قواعد المحلل النحوي
│   └── Main.java                   # نقطة الدخول والتشغيل
│
├── test.dart                       # كود Dart تجريبي شامل
└── README.md
```

---

## طريقة التشغيل

### 1. من خلال IntelliJ IDEA:
1. افتح المشروع في IntelliJ IDEA.
2. تأكد من إضافة `lib/antlr-4.13.2-complete.jar` كمكتبة (Add as Library).
3. افتح الملف `src/Main.java` واضغط على زر **Run ▶**.

### 2. من خلال سطر الأوامر (Terminal):
```powershell
# تجميع المشروع
javac -cp "lib\antlr-4.13.2-complete.jar" src\gen\*.java src\AST\*.java src\Main.java -d out\production\CompelerDart

# تشغيل المشروع
java -cp "lib\antlr-4.13.2-complete.jar;out\production\CompelerDart" Main
```
