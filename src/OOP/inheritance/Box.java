package OOP.inheritance;

public class Box {
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

    public void information() {
        System.out.println("Running The Box");
    }

}
