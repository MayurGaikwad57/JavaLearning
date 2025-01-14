package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for(int i = 0; i<10 ;i++) {
            try{
                System.out.println(divide(numerator[i],denominator[i]));
            }
            catch(Exception e){
 // out of bound exception , meaning that index is not present in the array and total length is being exceeded
                System.out.println(e);
            }
        }
        System.out.println("Good job brother");
    }
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
//        }
//   1) Note -> the below exception handling doesn't work because the error has been caught in above exception
//   2) Exception class is a parent class for all exceptions including runtime, I/O etc
//   3) Always ensure that you mention these exception class at the end so that if all the above catch blocks
//   specific to the exception fails ,then the exception will be caught by the exception class
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic Exception");
        }
    }
}
