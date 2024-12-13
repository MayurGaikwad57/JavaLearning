package OOP;

public class WrapperExample {
    public static void main(String[] args) {
        // if two reference variables are pointing at same object in heap memory
        // if anyone reference variable makes changes to the value of object ,
        // then the changes will also be reflected for anothere variable
        // let's look at the example
        legend one = new legend();
        legend two = one;
        one.rno = 20; // obj one's rno set to 20
        System.out.println(two.rno); // obj two's rno reflects the value set by obj one

       /* Inner working is : in Java there is no pass by reference , we only have pass by Value
        In case of objects both the reference variables are pointing to the same obj in memory
        one ---> rno similarly
        two --> one ---> rno
        in short two ---> rno
        both reference variables are pointing to the same object in memory hence
        changes made by one object are also reflected in anothere object
       */

        final int num = 221;
        // now we cannot modify or update the num as it is been declared as final
        // It is same as const in javascript , further assignments are not possible
        // Errors are thrown if attempted
        System.out.println(num);
        // Wrapper classes in java
        /*Wrapper classes are used to convert any primitive type into an object.
        The primitive data types are not objects, they do not belong to any class,
        they are defined in the language itself. While storing in data structures which
        support only objects, it is required to convert the primitive type to object first,
         so we go for wrapper class.
          */
      Integer a = 15; // stored like objects
        // System.out.println(a);

        // final keyword in case if non-primitives
        // When non-primitive type is final you cannot re-initialize it
       final understandFinally objFinal = new understandFinally();
       objFinal.Name = "Mayur";
       objFinal.Name = "king"; // you can update the properties in this way
        System.out.println(objFinal.Name);
// objFinal = new understandFinally(); re-initialization is not possible

    }
}

class legend {
    int rno ;
}
class understandFinally{
    String Name;
}