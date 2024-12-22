package OOP.accessModifiers;

public class Main {
    public static void main(String[] args) {
         A obj = new A(10,"Mayur");
//         int n = obj.A; // private member has to be accessed in that class only
        // Anothere way is by creating getters and setters
        // we can get and set the value of the private variable
//        System.out.println(obj.getter());

         String n = obj.name; // protected can be accessed in same package $ also in same class
        System.out.println(n);

    }
}
