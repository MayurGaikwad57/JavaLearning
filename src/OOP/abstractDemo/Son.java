package OOP.abstractDemo;

public class Son extends Parent {

    public Son(int num){
        super(num); // a way to initialise and access the varaibles of the abstract class
        // as you cannot create a object of that class
        this.num = num;
    }
   @Override
   void normal(){
       System.out.println("Normal Overridden");
   }
    @Override
    void carrear(){
        System.out.println("My Carrear choice is Engineer");
    }
    @Override
    void partner(){
        System.out.println("My partner is beautiful girl");
    }
}
