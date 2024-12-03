public class Equals {
    // all about == and equals() in java
    public static void main(String[] args) {
       /* 1. The == Operator
    The == operator checks whether two references point to the same memory location.
    When used with primitive types, it compares their values directly.
    For objects, it checks reference equality (i.e., whether both references point to the exact same object in memory).
       */
        int a = 5;
        int b = 5;
        System.out.println(a==b); // output as true

        String c = new String("Mayur");
        String d = new String("Mayur");
        System.out.println(c == d); // output as false
        /*Here, a and b are created using the new keyword, which forces Java to create two different objects in memory,
         even if their contents are the same.
         The == operator checks references and finds that they are different.
          */

        String e ="Mayur";
        String f = "Mayur";
        System.out.println(e==f); // output as true
        /* In the above case, the result is true because:
         Java uses a String Pool. When two string literals have the same value,
         Java optimizes memory by storing only one instance in the pool
          and pointing both references to it.
         */

        /* 2. The equals() Method
        The equals() method is defined in the Object class and is used to compare the contents of two objects.
        Default Behavior:
        If not overridden, the equals() method behaves just like == (it checks reference equality). However, many classes (e.g., String, Integer) override equals() to compare values instead of references.
        */
        String name1 = new String("Anil");
        String name2 = new String("Anil");

        System.out.println(name1.equals(name2));
//        System.out.println(name1 == name2);
        // output will be false as both the objets name1 and name2
        // reference different memory locations

        // KEY NOTE
        // You can use ==  in objects to check if two objects reference(point)
        // at the same memory location
    }
}
