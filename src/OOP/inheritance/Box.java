package OOP.inheritance;

public class Box {
    /* 1) if a class is declared as final in Java,
     all of its methods are automatically final, but its variables are not
     2) If any method inside the class is final then that method cannot be modified by any other
     class
     3) If any varaible is declared as final then that variable cannot be re-initialized
      */
    double l;
    double h;
    double w;
    int strength;
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double h, double w){
        super(); // this will call its parent class which is object class
        this.l = l;
        this.h = h;
        this.w = w;
        this.strength = 20;
    }

    Box(Box imp){
        this.l = imp.l;
        this.h = imp.h;
        this.w = imp.w;
    }
   public static void greeting(){
       System.out.println("Hello Mayur you are great!!");
   }
    public void information() {
        System.out.println("Running The Box");
    }

}
