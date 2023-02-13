package fr.centralesupelec.sio.demo.shapes;

// An interface defines a list of methods, without actual implementation. It is a contract to be implemented by a class.
public interface AreaProvider {

    // The methods are only defined with their signature (return type, name and arguments).
    double getArea();

    // As an exception to the general definition of interfaces, it is possible to also provide implemented methods.
    // In this case, the implementation is marked with the "default" modifier.
    // The implementation can only rely on other methods, or static computation (no reference to fields).
    default double getSurface() {
        return getArea();
    }

}
