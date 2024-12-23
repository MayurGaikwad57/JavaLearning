package OOP.abstractDemo;

public abstract class Parent {
   static int age = 250; // static variables are possible in abstract classes
    int num; // variables can also be present inside the abstract class
    abstract void carrear();
    abstract void partner();
    final int VALUE;
    public Parent(int num){
        this.num = num;
        VALUE = 123;
    }
//    abstract Parent(); abstract constructors cannot be created
/* 1) If any one method is declared as abstract inside the class , then the class should also be
declared as abstract
 2) abstract classes only contain the declaration of method , the body of the method has to be overridden
 in the child classes (Compulsory)
 3) Abstract classes has to be used only when we are sure that the child classes will overwrite
 the parent class
 4) You cannot create abstract static methods , as static methods cannot be overridden and abstract classes
 have to be overridden hence not possible
 5) but yes you can have static methods inside abstract class
 6) Abstract Methods have to be instantiated via derived classes which should not be abstract
 in our case both Son and Daughter are derived classes and are not abstract
 7) Abstract Classes have to be extended i.e inherited to be overridden
 8) You cannot declare abstract classes as final
 9) Static variables can also be created inside abstract classes



*/
    // static method in abstract class
    static void hello(){
        System.out.println("Hey Mayur");
    }

    // Normal other methods can also be written
    void normal() {
        System.out.println("Totally Normal");
    }
}
