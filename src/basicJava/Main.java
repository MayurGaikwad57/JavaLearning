package basicJava;// In java class name is same as fileName
// if file name is basicJava.Main.java then class name will also be basicJava.Main
// The main class in java in public so that any other file can access the main class
// In Java Classes and Objects are important Things

import java.util.Scanner;

//...........Let's write our first Java Program...............//
public class Main {
    public static void main(String[] args) {
         /* 1) In class to access the methods of the class we need object of that
             class and as inside main function our execution starts we need a method
             which can execute without object of that class
             and static variables or methods are the only ones which are not dependent on the
             object of that class
            2) This method is also public so that other classes and files can access this method
            3) return type is void meaning , it doesn't return anything

             */

        System.out.println("Hello World");

        /* 1) To take input in java we have to use object of Scanner class,
        Scanner class allows to take input in java
        Below is example

           */
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(a+b);

    }
}




