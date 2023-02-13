package fr.centralesupelec.sio.demo.shapes;

// Circle is another concrete class that extends the parent class Shape.
public class Circle extends Shape {

    public int radius;

    public Circle(Point origin, int radius) {
        super(origin);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // The java.lang.Math class contains a set of useful static methods to accomplish maths.
        // The round() method returns a long, it must be cast to be considered as an int (risk of oversize).
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "origin=" + getOrigin() +
                ", radius=" + radius +
                '}';
    }

}
