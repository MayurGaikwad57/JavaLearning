package OOP.inheritance;

public class BasicInheritance {
    public static void main(String[] args) {
//         Box obj = new Box(10,10,10);
//        System.out.println(obj.l);
//        Box obj1 = new Box(30);
//        System.out.println(obj1.l + " "+ obj1.h + " "+ obj.w);
//        Box obj2 = new Box(obj);
//        System.out.println(obj2.l + " "+ obj2.h + " "+ obj2.w);
//        Child obj = new Child(25);
//        System.out.println(obj.l + " "+ obj.h + " "+ obj.strength);


//        System.out.println(obj.strength)
    // this will throw error as the object obj is instance of parent class
    // so parent class object cannot access the properties of child class
    // child class is the class which extends the parent class
    // in above case strength is property of child class and cannot be accessed by parent
    // class object obj



        // Anothere Fact
//        Box a = new Child(10,5,11,25);
//        System.out.println(a.h);
//        System.out.println(a.strength); will not work 
/* ..........................The Reason why the above thing happens.............................

This is an excellent question about inheritance and polymorphism in Java.
You are observing behavior that may appear unusual at first,
but it makes complete sense once you understand reference types and object instantiation.

The Code in Question
java
Copy code
Box a = new Child(10,5,11,25);
System.out.println(a);
Box a → This is a reference variable of type Box.
new Child(10,5,11,25) → This is an instance (object) of the Child class.
Your doubt:

Why does it seem like the reference variable a points to a Box object when we are creating
a Child object?
Concepts You Need to Know
Reference Type vs Object Type:

Reference type determines what methods and fields can be accessed at compile-time.
Object type determines the actual object being created in memory during runtime.
In your case:

Box a → The reference type is Box.
new Child(...) → The object type is Child.
Parent Reference to Child Object:

It is allowed in Java to have a parent class reference point to a child class object.
This is a fundamental concept in polymorphism and enables runtime behavior to depend on
the actual object type.
Overridden Methods in Child Class:

If the child class overrides any method of the parent class,
the child's implementation will be executed, even if the reference is of the parent type.
This is because the runtime object decides which version of the method to call.
Accessing Fields:

If you try to access fields directly, they are resolved based on the reference type,
not the object type.

Box a = new Child(10,5,11,25);
//The reference type Box tells the compiler that a can only access members of the Box class.

For example: If Child had any additional methods or fields,
you wouldn't be able to access them with a.

*/

//        Child ref = new Box(10,10,10);
        /*  Object here is of parent class
         Then how will you call the constructor
        The failure here is because the Box class is a parent class and has no idea
        about the properties and methods of the child class
        also to access the strength property, it should be initialised
        The reference variable is of child class but the object is of parent class
        So there is an error that means you cannot have a child class reference pointing to
        the parent class object
        */

   Child newRef = new Child(10,20,30,100);
//        System.out.println(newRef.strength);

      Child obj = new Child();
      // greeting is a static method and has no dependency on object
      Box.greeting();
      /* Static methods cannot be overridden
         they are called with the class name and are independent of objects
         and overriding depends on the object
         hence , there is no point in overriding them
       NOTE--> Static Methods can be inherited , but cannot be overridden                     */



    }
}
