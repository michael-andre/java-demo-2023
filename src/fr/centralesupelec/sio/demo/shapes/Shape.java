package fr.centralesupelec.sio.demo.shapes;

// Shape is the parent class in our hierarchy of model classes, it is extended by more specific shape classes.
// It is an "abstract" class: it contains partial implementation, cannot be instantiated itself and must be subclassed.
// A Shape is declared to implement the AreaProvider interface, but the method getArea() is NOT implemented here.
// As a consequence, subclasses have to provide the method.
public abstract class Shape implements AreaProvider {

    // Encapsulation: As a best practice, fields are made private in Java to hide implementation details from outside.
    // The "final" keyword indicates that the value cannot change after the construction of the class (safer).
    // In Java, a field declared of type Point can hold a value of that type, or be null (null is the default).
    private final Point origin;

    // Constructors are declared with the name of the class and arguments. They are called when instantiating the class.
    // As soon as 1 constructor is declared, the implicit public parameterless constructor is no more available.
    public Shape(Point origin) {
        this.origin = origin;
    }

    // Classes can have multiple constructors, with different parameter signatures.
    public Shape(int x, int y) {
        // A constructor can call another constructor of the same class using this(). It must be the first statement.
        this(new Point(x, y));
    }

    // A method to read data from a class is referred as a "getter". As a convention, the name starts with "get".
    // Encapsulation: We expose public getter and setters to access fields, but the internal implementation is hidden.
    public int getX() {
        return origin.getX();
    }

    // A method to modify data of a class is referred as a "setter". As a convention, the name starts with "set".
    public int getY() {
        return origin.getY();
    }

    public void setX(int x) {
        this.origin.setX(x);
    }

    public void setY(int y) {
        this.origin.setY(y);
    }

    public Point getOrigin() {
        return origin;
    }

}
