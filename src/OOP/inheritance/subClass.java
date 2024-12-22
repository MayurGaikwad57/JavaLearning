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