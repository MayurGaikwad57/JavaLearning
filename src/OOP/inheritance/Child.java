package OOP.inheritance;

import OOP.accessModifiers.A;

public class Child extends Box{
    int strength;
    public Child() {
        this.strength = 1;
    }
    Child(double side, int strength) {
        super(side);
        this.strength =  strength;
    }
     Child(Child other){
        super(other);
        this.strength = other.strength;
        /* Inheritance Hierarchy:
The Box constructor only copies properties of Box (l, h, w) because that's all it knows about.
Even though the Child object is passed, the Box constructor sees it as a Box instance,
not as a Child instance.
           The additional properties of the child (strength) are not accessible to the parent because:
The parent class doesn’t "know" about the child class.
Java inheritance ensures encapsulation by restricting access to only the parent-defined members.*/
     }

    Child(double l , double h , double w, int strength){
        super(l,h,w);
        //The super() call must always be the first statement in a constructor.
        // it will call a constructor matching these arguments
        // Anothere use case of super keyword
        System.out.println(super.strength);
        // The above statement will print the strength variable from parent class
        this.strength = strength;
        System.out.println(this.strength);
        // The above statement will print the strength from this class i.e child class

/*  Why is super Used?
Accessing Parent Class Members:

To resolve ambiguity when a derived class has members (variables or methods) with
the same name as those in the parent class.

Calling Parent Class Constructors:

To explicitly invoke a parent class constructor from a subclass.
Overridden Method Access:

To call a method from the parent class that has been overridden in the subclass.
   */


    }


}
