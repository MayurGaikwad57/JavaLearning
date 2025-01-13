package Methods;

public class MethodOverLoading {
    /* Method Overloading is a Compile time polymorphism
    . In method overloading, more than one method shares the same method name with
     a different signature in the class. In method overloading,
      the return type can or can not be the same, but we have to change the parameter because,
       in java, we can not achieve method overloading by changing only the return type of the method            */
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
