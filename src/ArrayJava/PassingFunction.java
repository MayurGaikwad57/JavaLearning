package ArrayJava;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        // passing arrays into function
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr)); // print initial array
        display(arr);
    }
    static void display(int[] dis){
        dis[0] = 55; // value of the array 0th index is changed to 55
        System.out.println(Arrays.toString(dis)); // print modifed array
    }
}
