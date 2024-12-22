package OOP.Static;

public class StaticInt {
    // Initialization of static variables
    static int a = 15;
    static int b = 2;
    /* 2. Static Block
Definition: A static block is a block of code that runs automatically when the class is loaded for the first time into memory.
Key Characteristics:
Runs once per class, not per object.
Used to initialize static variables or perform operations that need to happen only once.
Executes before the main method or any other static method of the class.
will run only once when the object is first created i.e when the class is loaded is for the first time*/

  static {
      System.out.println("I am the best");
      b = b * 5; // variable b will be initialised here to 20
  }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a +" "+StaticInt.b);
        StaticInt.b += 3;
        System.out.println(StaticInt.a + " "+ StaticInt.b);
        /*  3. Why Does the Static Block Run Only Once?
Static blocks are executed when the class is loaded into memory by the class loader.
This happens only once per class during the lifetime of the program.When you create additional objects
(e.g., StaticInt obj1), the class is not loaded again because it is already in memory.
 Hence, the static block is not executed for subsequent objects.                     */
        StaticInt obj1 = new StaticInt();
        System.out.println(StaticInt.a + " "+ StaticInt.b);

    }

}
