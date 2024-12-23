package OOP.inheritance;

import OOP.accessModifiers.A;

public class subClass extends A {
    public subClass(int num , String name) {
        super(num,name);
    }

//    public static void main(String[] args) {
//        subClass obj = new subClass(10,"jon");
//        String num = obj.name; // protected member can be accessed in different package in subClass
//    }
//    public static void main(String[] args) {
//        A obj = new subClass(10,"jon");
//        String num = obj.name; // protected member can be accessed in different package in subClass
//    }
    /*  The above is the very Imp point regarding the Protected Memeber of the Class
    1) The protected Member can be accessed by only the subClass of different package
    2) In above ex-> the reference variable obj will try to access the protected variable name of class A
    but the issue is according to the rule only subClass of different package can access the protected memeber
    so the above commented code will not be able to access the protected member name as the class itself(A) in which the
    member is protected is trying to access the member
     */


}

/* Anothere important example regarding acessing the protected Member */
class miniSubClass extends subClass{
    public miniSubClass(int num , String name){
        super(num,name);
    }

    public static void main(String[] args) {
        miniSubClass obj = new miniSubClass(20,"Kolaveri");
        String n = obj.name;
        /* 1) Protected Member can also be accessed sub sub class of the subclass of package
        * 2) here miniSubClass extends the subClass which is extending the parent class A
        * 3) So as miniSubClass extends subClass it also has the access to the protected member name
        * 4) In above example you can see name can be accessed
        * 5) SO inshort it should be subClass of parent class or subClass of itself
        * where you can access the protected member
        * */


    }
}