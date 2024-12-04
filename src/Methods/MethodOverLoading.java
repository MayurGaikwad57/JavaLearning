package Methods;

public class MethodOverLoading {
    public static void main(String[] args) {
        // Method(function) Overloading in java
        fun(5,10); // will call function which has 2 parameters
        fun(5,10,15); // will can function which has 3 parameters
        fun("Mayur");
    }
  static void fun(int a , int b){
        int sum = a+b;
        System.out.println(sum);
    }
    static void fun(int a , int b , int c) {
         int sum = a+b+c;
        System.out.println(sum);
    }

    static void fun(String a){
        System.out.println(a);
    }

}
