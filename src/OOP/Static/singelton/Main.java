package OOP.Static.singelton;

public class Main {
    public static void main(String[] args) {
     Singleton obj = Singleton.getInstance();
     Singleton obj1 =Singleton.getInstance();
     Singleton obj3 = Singleton.getInstance();


       if(obj == obj1 )  {
           System.out.println("Both Ref Variables point to same object in memory");
       }
       else{
           System.out.println("Both Ref point to different objects");
       }
    }
}
