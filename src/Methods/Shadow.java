package Methods;

public class Shadow {
    // Class-level static variable
    static int x = 100;

    public static void main(String[] args) {
        // Accessing the class variable `x`
        System.out.println(x); // Output: 100 (class-level variable is accessible here)

        // Declaring a local variable `x` in the `main` method
        // This shadows the class-level variable `x` within the `main` method's scope
        int x = 55; // Local variable
        System.out.println(x); // Output: 55 (local variable shadows class variable)

        // To access the shadowed class variable, use the class name
        System.out.println(Shadow.x); // Output: 100 (explicitly accesses the class variable)

        // Calling another method to demonstrate shadowing in a different scope
        call();
    }

    static void call() {
        // No local variable `x` is declared in this method
        // The class-level variable `x` is accessible
        System.out.println(x); // Output: 100
    }
}

