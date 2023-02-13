// A *.java file always starts with the "package" declaration. The package must match the directory structure.
package fr.centralesupelec.sio.demo;

// All classes referenced in the file must be declared as an "import" with their full package + name...
// ...except from 1) classes in the java.lang.* package and 2) classes in the exact same package as the file.
// The import lines below are often automagically inserted by the IDE!
import fr.centralesupelec.sio.demo.shapes.*;

// In Java, every piece of code must be encapsulated in a class, so we create a class for the main entrypoint.
// The class is "public" to be accessible/visible outside the package (it is also mandatory for entrypoint classes).
public class Main {

    // By convention, an entrypoint method (first executed code in a java program) is called "main".
    // The method is also "public" to be accessible as an entrypoint.
    // The method is "static" to be callable on the class itself (Main.main(...)) vs on an *instance* (new Main()).
    // The method executes code and returns nothing, so it uses the "void" keyword in place of the return type.
    // Inside the parenthesis, the arguments are declared with their type (here, a single array of string args).
    public static void main(String[] args) {

        // In Java, variables are declared with their type. They can be declared and given a value at once.
        // Primitive types are lowercase, whereas object types use CamelCase.
        int a = 1;
        long b;
        b = 4;
        // "float" literal values are always suffixed with "f" to be distinguished from "double".
        float c = 3.14f;
        double d = b / 3.;
        boolean f = false;

        // When loosing precision between types (b is a double and c is a float), an explicit casting is mandatory.
        b = (long) c;
        c = a + b;
        c = (float) ((a + b) / d);

        // Strings are manipulated like objects, but they can obviously be declared with double-quoted literals.
        // The plus operator is used for string concatenation.
        String hello = "Hello" + " world!";
        // The "console" of a command line program is accessible as a static "out" stream.
        // This stream has various methods to write to, with overloads to log arguments of various types.
        System.out.println(hello);

        // Conditional block with the if... else... keywords, with the condition between parenthesis.
        // The curly braces can be omitted if the block consists of a single line.
        if (a != 2) System.out.println("a != 2 !");
        else {
            System.out.println("a equals 2");
        }

        // A common for... loop structure, with 3-part declaration between parenthesis, separated with semicolons.
        // The 1st part is the initialization of the typed local variable controlling the loop, with initial value.
        // The 2nd part is the breaking condition. The block is executed while the condition is true.
        // The 3rf part is the increment instruction. "i = i + 1", "i += 1" and "i++" are equivalent.
        for (int i = 2; i < 10; i++) {
            System.out.println(i);
        }

        // A "switch" statement is an elegant way to test multiple possible values of a variable.
        switch (a) {
            case 1:
                // In java, switch instructions DOES NOT implicitly break, so execution will continue to the next case!
            case 2:
                System.out.println("a equals 1 or 2");
                // Use the break keyword to exit from the switch. A linter can enforce its usage, as a best practice.
                break;
            case 3:
            default:
                System.out.println("a is not 1 or 2");
        }

        // An instance of a class in declared with the "new" keyword, and a call to the constructor method.
        Point p = new Point(20, 40);
        Rectangle rect = new Rectangle(p, 20, 100);
        // setX() is a public method of the class Rectangle, so it can be accessed here.
        rect.setX(3);

        // Polymorphism: a subclass cas be used everywhere a parent class is declared.
        Shape anyShape = new Circle(new Point(0, 0), 200);
        System.out.println(anyShape.toString());

        // Even if anyShape is instantiated as a Circle, it is only known here by its type, Shape.
        // If a subclass call is needed, a test can be performed with "instanceof", and a casting is mandatory.
        if (anyShape instanceof Circle) {
            // Use casting with caution, as the compiler will not be able to check it (potential error at runtime!).
            ((Circle) anyShape).setRadius(300);
        }

        // Every class implicitly extends Object, so methods of this class are available.
        // The toString() method has been overridden in Rectangle, so this new implementation will be used.
        System.out.println(rect.getArea());

    }
}