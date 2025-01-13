package OOP.polymorphism;

public class Square extends Shapes {
    void area(){
        System.out.println("Area is r*r");
    }

//   final void area(){
//        System.out.println("Area is r*r");
//    }
    /* 1) final method cannot be overridden
       2) "early binding" refers to when a method or property is resolved at compile time,
        meaning all type information is known before the program runs
              */
}
