package OOP.accessModifiers;

public class subClass extends A {
    public subClass(int num , String name){
        super(num,name);
    }

    public static void main(String[] args) {
        subClass obj = new subClass(10,"Elvish");
        String n = obj.name;
        // Protected member can be accessed in same package and subClass
    }
}
