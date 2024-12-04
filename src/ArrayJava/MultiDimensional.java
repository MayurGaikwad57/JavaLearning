package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    // 2 dimensional array in java
    // syntax int[][] arr = new int[3][4]
    // [3][4] 3 rows and 4 columns we  will have
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3}, // 0th row
//                {4,5,6}, // 1st row
//                {7,8,9}, // 2nd row
//        };
//        System.out.println(arr[0][1]);
//        Scanner input = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        for (int i = 0; i< arr.length;i++) {
//            for (int j = 0; j<arr[i].length;j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }
        // displaying the data of 2D array
        // follow same approach that we have made for taking user input
//        for (int i = 0 ; i < arr.length;i++) {
//            for(int j =0; j<arr[i].length;j++) {
//                System.out.println(arr[i][j] + "");
//            }
////            System.out.println();
//        }
        // dislaying the two dimensional array using enhanced for loop
//        for(int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }
        // Anothere method 3rd one
//        for(int i = 0 ; i< arr.length;i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        int[][] a = {
                {1,2,3,4,5},
                {1,2,4},
                {6,7,9},
                {10,12},
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
