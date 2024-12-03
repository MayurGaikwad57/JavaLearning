import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        // print largest of 3 numbers
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        if(a>b && a>c) {
//            System.out.println("a is greater:"+a);
//        }
//        else if(b>a && b>c) {
//            System.out.println("b is greter:"+b);
//        }
//        else {
//            System.out.println("c is greater:" + c);
//        }
        // Objective -> to check if given char is upperCse or
        // lower case
//        Scanner ch = new Scanner(System.in);
//        String sol = ch.nextLine();
//        char firstChar = sol.trim().charAt(0);
//        if(firstChar>='a' && firstChar<='z'){
//            System.out.println("first char is lowerCase");
//        }
//        else if(Character.isLowerCase(firstChar)) {
//            System.out.println("first char is Uppercase");
//        }
//        else {
//            System.out.println("The Char is not UpperCase nor LowerCase");
//        }

        // Find the number of occurences of the partiular word
        int num = 1223422;
        int count = 0;
        while(num>0) {
           int rem = num%10;
            if(rem == 2) {
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
