package OOP.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int num){
        super(num);
        this.num = num;
    }
    @Override
    void carrear(){
        System.out.println("My Carrear is Princess");
    }

    @Override
    void partner() {
        System.out.println("My partner is jon Cena");
    }
    @Override
    void normal(){
        System.out.println("Normal Overridden");
    }
}

