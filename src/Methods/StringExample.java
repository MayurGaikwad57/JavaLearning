package Methods;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//     String dis = greet("Mayur Gaikwad");
//        System.out.println(dis);
// In case if you want to take input from the user and print it
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = input.next();
        String disName = greet(name);
        System.out.println(disName);
    }
   static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
