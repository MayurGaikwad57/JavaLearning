import java.util.Scanner;

public class Primitives {
    // All about data types in java
    public static void main(String[] args) {
    int a = 25;
    float b = 25.6f;
    // by default decimal is considered as float so we write small f
        double c = 123345.2345;
        long d = 12345673232422L;
        // we have to add L at the end to specify long
    char e = 'M';
    String f = "Mayur";
    boolean g = false;
//        System.out.println(g);
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name:");
      String name = input.nextLine();
        System.out.println(name);
    }
}
