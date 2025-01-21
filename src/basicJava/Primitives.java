package basicJava;

public class Primitives {
    // All about data types in java
    // All the primitve data types are stored in stack only
    // Non-primitve data types like String , objects , array's , or any class Instance etc will
    // be stored in heap memory  (only reference to the object is stored in stack)


    // Primitive Data types include
    // int,char,long,double,byte,char,float,boolean
    // be stored in heap memory only
    public static void main(String[] args) {
        // Example-->
        String str = new String("Hello");
        System.out.println(str);
        // reference varaible str is stored in stack and the object string is stored in heap
        /*   Additional Notes on Strings:
Strings in Java behave slightly differently:
String literals are stored in a special part of the heap called the string pool for optimization
Example->
String str1 = "Hello"; // Stored in the string pool.
String str2 = "Hello"; // Points to the same "Hello" in the pool.
If you create a String using new, it is stored directly in the heap and not in the string pool:

String str = new String("Hello"); // New object in the heap.  */

//    int a = 25;
//    float b = 25.6f;
//    // by default decimal is considered as float so we write small f
//        double c = 123345.2345;
//        long d = 12345673232422L;
//        // we have to add L at the end to specify long
//    char e = 'M';
//    String f = "Mayur";
//    boolean g = false;
////        System.out.println(g);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter Your Name:");
//      String name = input.nextLine();
//        System.out.println(name);
    }
}
