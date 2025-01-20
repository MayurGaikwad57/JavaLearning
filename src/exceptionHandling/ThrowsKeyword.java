package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        method3();
    }
    public static void method3() throws FileNotFoundException{
        method2();
    }
    public static void method2() throws FileNotFoundException{
        method1();
    }
//    public static void method1() throws FileNotFoundException {
//        FileReader file = new FileReader("a.txt");
//    }
    public static void method1() throws FileNotFoundException {
         try {
             FileReader file = new FileReader("a.text");
         } catch (Exception e) {
             throw new  FileNotFoundException("oops");
// throw keyword is used to forcefully throw an exception , new object of that exception is created
//although the exception is handled but still to forcefully inform              
         }
    }

/* .......................NOTES.....................................
* Throws keyword is used when the method may throw the exception in our case method
* method1() throws exception file not found , which means the method which will be
* calling method1() i.e method 2 will now be responsible for handling the exception that arises
* in method1()
* sol--> either use ,try catch to handle or if it is used in hierarchy , then use throws keyword
* so that the method calling the one with exception will handle it
* In above examples there is exception in method1() , it uses throws keyword followed by exception name
* indicating that whichever method will call it should handle that exception
* then similarly , method2() which calls one uses throws to indicate method 2 has exception which needs to
* handled by the one calling it , same with method3()
* and finally the main method , which is calling the method 3 instead of using the try catch block
* uses throws followed by exception name indicating that now the JVM will handle the exception if it arises
* IF THERE ARE NO EXCEPTIONS , THEN THE PROGRAM WILL EXECUTE
*/
}
