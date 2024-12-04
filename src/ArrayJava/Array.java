package ArrayJava;

public class Array {
    public static void main(String[] args) {
        // Arrays are mutable in java
    // Arrays in java (Very Imp Concept in Java)
        // Arrays are stored in heap in java
        // not only array any object that we have is stored in heap memory
        // heap objects are not continious
        // declaration of array happens at runtime
        // and creation of new object and assigning it to heap memory
        // is done at runtime
  // NOTE -> ARRAYS IN JAVA MAY NOT BE CONTINIOUS -> DEPENDS ON JVM
// OFFNOTE --> 1) null cannot be assigned to any primitve dataType
        // you can assign it to non-primitive dataType like String , objects  etc
        // syntax --> dataType[] arrName = new dataType[size]
        int[] arr = new int[5]; // one way to create an array
        arr[0] = 10;  // adding values in array if we create array in the above form
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            // looping through array to print all the elements
        }
        int[] ros = new int[5];
        System.out.println(ros[0]); // int array deafulty has 0 in it
// so our ros looks like [0,0,0,0,0]
        String[] str = new String[5];
        System.out.println(str[0]); // String array has default value null
// so our str looks like [null,null,null,null,null]
 // Anothere 2nd Method of creating an array

    int[] arr1 = {10,15,20,25,40} ;


    }
}
