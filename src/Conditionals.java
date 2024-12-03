import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int a = 25;
        if(a == 25) {
            System.out.println("You are king Manus");
        }
        else {
            System.out.println("Learning Basics of Conditionals in java");
        }
        int count = 1;
        while(count != 5) {
            System.out.println(count);
            count++;
        }
        for(int i=1;i<5;i++) {
            System.out.println(i);
        }
        // Use for loop when you know how many times the loop will run
        // Simple input output program
        // convert temp from degree to fahrenheit
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temperature in Degree : ");
        float temp = in.nextFloat();
        float farh = (temp * 9/5) + 32;
        System.out.println(farh);
    }

}
