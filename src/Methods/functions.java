package Methods;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a,b);
    }
   static void sum(int a, int b) {
        int sum = a+b;
       System.out.println(sum);
    }

}
