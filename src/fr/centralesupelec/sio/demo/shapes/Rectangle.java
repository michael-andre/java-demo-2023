package fr.centralesupelec.sio.demo.shapes;

// Rectangle is a class that extends the abstract class Shape. It inherits all of its members.
// As it is not itself abstract, it can be instantiated, and it must implement the missing methods from Shape (getArea).
public class Rectangle extends Shape {

    // In Rectangle we define only information specific to that shape.
    // Encapsulation: The fields are private, we could easily switch or implementation to a "Size" class instead.
    // By default, fields of primitive types are initialized to the default value (0 for numbers, false for booleans).
    private int width;
    private int height;

    public Rectangle(Point origin, int width, int height) {
        // When extending a parent class that has a constructor, it must be called with super(), as the first statement.
        super(origin);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // The following syntax is an annotation, it can be used on a method, a class of an argument.
    // It can be used to carry metadata that are kept at compile time.
    // The Override annotation is an optional, conventional annotation to mark methods defined in a parent.
    @Override
    public double getArea() {
        return height * width;
    }

    // The implicit parent of Shape, Object, has a default toString() method. It can be redefined for the rectangle.
    // In case of a redefinition, the @Override annotation is also used.
    @Override
    public String toString() {
        return "Rectangle{" +
                // The getOrigin() call below returns a Point, it will be serialized using its own toString() method.
                "origin=" + getOrigin() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
