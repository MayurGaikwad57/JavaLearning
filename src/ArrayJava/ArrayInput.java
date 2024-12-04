package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
//        // taking input in array and displaying it
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        // we will use for loop to get input
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        // displaying the output using for loop
//        // looping through array to get all the values
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }
//        // the same can be acheived through the use of forEach loop
//        for(int num : arr){
//            // num is basically representing the elements of array here
//            System.out.println(num);
//        }
        // taking input and displaying it using for string
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
//        System.out.println(Arrays.toString(str));
//        for(String a : str) {
//            System.out.println(a);
//        }

    }
}
