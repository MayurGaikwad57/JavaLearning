package exceptionHandling;

public class StackTrace {
    public static void main(String[] args) {
        try{
            level1();
        } catch(Exception e){
//            System.out.println(e);
            // here we will get to see only 1 message but without the try catch we were getting the
            // hierarchy of exceptions , but with try catch it is gone
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i = 0; i< stackTrace.length; i++){
                System.out.println( stackTrace[i]);
                // this stackTrace has all the program exception trace and provides us the hierarchy
                // where is exception occuring in levels
            }

        }
    }
    public static void level3(){
        int[] arrays = new int[5];
        arrays[5] = 50;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
/* In the above example there is an array out of bound exception found
*  by avoiding try catch block the jvm has given an exception in terminal
NOTE--> All these exceptions are called as UNCHECKED EXCEPTION as these exceptions are not being checked at compile time
           */

}
