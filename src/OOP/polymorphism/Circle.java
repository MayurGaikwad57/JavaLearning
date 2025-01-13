package OOP.polymorphism;

public class Circle extends Shapes{
    @Override //annotation in java used when any method is overridden
    void area(){
        System.out.println("Area is pi*r*r");
    }
    void getSquare(){
        super.area();
    }

    /*  Method overriding is a run-time polymorphism.
    Method overriding is used to grant the specific implementation of the method which is already
    provided by its parent class or superclass.
    It is performed in two classes with inheritance relationships.
    Method overriding always needs inheritance.
    In method overriding, methods must have the same name and same signature
    In method overriding, the return type must be the same or co-variant.
    The argument list should be the same in method overriding.
    Private and final methods can’t be overridden.
    */
}