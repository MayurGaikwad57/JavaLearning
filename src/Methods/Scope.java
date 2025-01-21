package Methods;

public class Scope {
    public static void main(String[] args) {
        // Understanding scope in Java

        // basicJava.Main scope (variables declared here can be accessed anywhere in the main method)
        int a = 5;
        int b = 10;
        String name = "Mayur";

        // Uncommenting the following lines will cause errors because the variables are not in scope:
        // System.out.println(f); // 'f' is defined in block scope, not accessible here
        // System.out.println(c); // 'c' is not defined in the current scope

        // ===================
        // BLOCK SCOPE in Java
        // ===================
        {
            // Block Scope Rules:
            // 1) Variables from the outer/main scope can be accessed in the block scope.
            System.out.println(a); // Accessing 'a' declared in the main scope

            // 2) Variables declared in block scope cannot be accessed outside the block.
            int d = 55; // Declared inside the block scope
            int f = 50; // Declared inside the block scope
            System.out.println("Block scope variable 'd': " + d);
            System.out.println("Block scope variable 'f': " + f);

            // Uncommenting this line will cause an error, as 'a' is already declared in the main scope:
            // int a = 10;

            // 3) Variables in the block scope cannot "shadow" or reinitialize variables from the outer scope.
            // However, values from the outer scope can be modified in the block scope:
            name = "King"; // Modifying the value of 'name' from the main scope
            System.out.println("Updated name: " + name);
        }

        // Uncommenting the following line will cause an error because 'd' is not accessible outside the block:
        // System.out.println(d);

        // Variable 'name' was updated in the block and retains its new value in the outer scope:
        System.out.println("Name in main scope: " + name);

        // ====================
        // FOR LOOP SCOPE in Java
        // ====================
        for (int i = 0; i < 10; i++) {
            // Variables declared in a loop scope are local to the loop:
            // Uncommenting the following line will cause an error as 'a' is already declared in the main scope:
            // int a = 25;

            // However, you can modify the value of an outer scope variable within the loop:
            a = 250; // Updating the value of 'a' (declared in the main scope)
        }
        System.out.println("Value of 'a' after loop: " + a); // Prints the updated value of 'a'

        // Uncommenting the following line will cause an error because 'i' is not accessible outside the loop:
        // System.out.println(i);

        // ====================
        // METHOD SCOPE in Java
        // ====================
        sum(); // Calling the sum method
    }

    static void sum() {
        // Method Scope:
        // Variables declared in this method are local to this method and cannot be accessed outside.
        int c = 20;

        // Uncommenting the following line will cause an error because 'a' is not defined in this scope:
        // System.out.println(a);

        System.out.println("Value of 'c' in method scope: " + c);
    }
}
