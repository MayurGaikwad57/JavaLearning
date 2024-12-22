package OOP;

public class InnerClasses {
    // Static declaration means that class A is not dependent on the objects
    // of the class InnerClasses
   static public class A {
         static String Name;

        A(String Name) {
            A.Name = Name;
        }
    }
        public static void main(String[] args) {
    /*       A obj = new A("Mayur"); // gives error as this cannot be done
             Because the innerClass A depends itself on the outer class InnerClasses
             as a result of which the class A depends on the instance i.e object of the InnerClasses
             To resolve this issue you can either change the class to static or define the class
             outside so that there are no nested classes
             System.out.println(obj.Name);
    */
            A obj = new A("Elvish");
            A obj1 = new A("Anil");
            // This will work as the class A is declared as static and has no dependencies on instance of
            // class InnerClasses
            System.out.println("The Name is :"+A.Name);
            System.out.println("The Name is :"+A.Name);


        }

}
// The definition and declaration outside like this will work
//class A {
//    String Name;
//
//    A(String Name) {
//        this.Name = Name;
//    }
//}



// Some of the key notes
/* 1. Static vs Non-static Context
Static Variables/Methods: These are shared across all instances of a class. They belong to the class itself, not the object. This is why you can access them without creating an object.
Non-static Variables/Methods: These belong to individual objects (instances of a class). You need to create an object to access them because they are tied to a specific instance.
2. Static Inner Classes
A static inner class (like A in your code) is nested inside an outer class but declared as static.
Declaring an inner class static means:
It does not depend on an instance of the outer class (InnerClasses in this case).
You can create objects of the static inner class without creating an object of the outer class.
However, the static keyword does not make the inner class itself static in the sense of shared memory or static variables. It simply means that:
The inner class can exist independently of the outer class instance.
You still need to create objects of the static inner class to access its non-static fields/methods.

Step-by-Step Analysis
Static Class A:

A is declared as a static inner class inside InnerClasses.
Because A is static, you do not need an object of InnerClasses to create an instance of A.
However, the class A itself behaves like a normal class for its own members.
Non-static Property Name:

Inside A, you have a non-static field Name.
This means each object of class A will have its own separate Name field.
Static classes and non-static variables are independent concepts.
Object Creation (new A("Elvish") and new A("Anil")):

obj and obj1 are two separate objects of the static class A.
Each object has its own memory allocation for the non-static field Name.
This is why obj.Name and obj1.Name are independent and hold different values ("Elvish" and "Anil").
Why You Need to Create Objects:

The static class A does not automatically make its members (fields or methods) static.
To access non-static members like Name, you still need to create objects of the class.
If the field Name were declared as static, then you could access it directly through the class name (A.Name), and it would be shared among all instances.
4. Static Inner Class ≠ Static Variables
This is where the confusion lies. Here’s the key point:

Declaring a class as static does not mean all its fields or methods become static.
A static class only means that it can be instantiated without an instance of the outer class.
You still have to create objects of the static class to access its non-static fields.
If you want the Name property to be shared across all objects of class A, you would declare it as static like this:

5. Summary
A static inner class can be instantiated without creating an instance of the outer class.
However, the members (fields/methods) of a static inner class behave like those in a normal class.
Non-static fields/methods are still instance-specific. You need to create objects to access them.
Static inner classes do not make their members static by default.
Your two objects obj and obj1 are completely independent because the Name field is non-static, and each object gets its own copy.
Where is the Catch?
The confusion arises because "static" is overloaded in its meaning:

Static classes: A class that can exist independently of an outer class instance.
Static variables/methods: Belong to the class and are shared among all instances.
In your code:

The class A is static, but its property Name is not.
You still need to create objects of A to store individual Name values.
If Name were static, it would behave like a shared variable among all instances of A.
                           */
