package OOP.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Daughter obj = new Daughter(25);
        obj.carrear();
        obj.partner();
        System.out.println(obj.VALUE);
        obj.normal();
        Son son = new Son(45);
        son.carrear();
        son.partner();
        System.out.println(son.num);
        son.normal();
//        Parent obj2 = new Parent();
//        objects of abstract class cannot be created
         Parent.hello();
    }
}
