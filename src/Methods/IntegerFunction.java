package Methods;

import java.util.Scanner;

public class IntegerFunction {
    public static void main(String[] args) {
//        int getSum = sum(10,15);
//        System.out.println(getSum);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int a = input.nextInt();
        System.out.println("Please enter number");
        int b = input.nextInt();
        int sum = add(a,b);
        System.out.println("The Sum is :");
        System.out.println(sum);
    }
//    static int sum(int a, int b) {
//        int sum = a+b;
//        return sum;
//    }
    static int add(int a , int b){
        int sum = a + b;
        return sum;
    }
}
