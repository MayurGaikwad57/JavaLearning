package OOP.inheritance;

public class Child2 extends Child {
    int power;

    Child2(){
        super();
        this.power = -1;
    }
    Child2(Child2 others){
        super(others);
        this.power = others.power;
    }

    Child2(double l, double h, double w, int strength, int power){
        super(l,h,w, power);
        this.power = power;
    }

    Child2(double side , int strength , int power){
        super(side,strength);
        this.power = power;
    }
}
