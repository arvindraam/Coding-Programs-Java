package test_program;

// Abstract Product Interface for Cars
public interface Carr {
    void assemble();
}

// Abstract Product Interface for Car Specifications
interface CarSpecification {
    void display();
}

// Abstract Factory Interface
interface CarFactory {
    Carr createCar();
    CarSpecification createSpecification();
}