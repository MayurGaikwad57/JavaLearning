package OOP.Static;

public class Main {
    int a = 20;

    //variable declared as a non-static member
    //Non-Static members belong to the instance of the class , not the class itself
    public static void main(String[] args) {
        Human a = new Human("Mayur", 15, false, 1000);
        Human b = new Human("Anil", 20, false, 2000);
        System.out.println(Human.population);
        System.out.println(Human.population);

        // Make sure you access the static variable via class Name
        // if you use the instance variable it will still work , but the convention is to use
        // class name as static variable is independent of object
        // Static variables can be accessed without even creating objects of that class
        /* e.x -->
        In the above case we have 2 objects created , but without even creating objects can
        access the static variable
         System.out.println(Human.population);
         System.out.println(Human.population);
         Static variable population accessed without creating objects
         reason --> Static variables are independent of the objets of the class
         so they can be accessed without even creating the objects of the class
 */
        Main obj = new Main(); // created object to access the non-static member of class
        // as it belongs to the instance of the class i.e object
        System.out.println(obj.a); // output a = 20;
    }

    // Non Static Member inside a static
    static void fun() {
//        greeting();
        //Error is beacuse you are trying to access the non-static method inside static method
        // Throws error as the non-static method greeting() cannot be accessed from a static method
        // To access the non static method greeting() we will create a instance of basicJava.Main Class
        Main obj = new Main();
        obj.greeting(); // This can be accessed now
    }

    void greeting() {
        advanced();
// These advanced method is a non-static method and we are calling it inside a non-static method as well
// So here, there is no need of creating instance of the class as the calling point is main
// whenever an object is created inside main with that reference variable only you can access these
// greeting() method and as advanced which is also non-static method is inside greeting() it will also work


//        fun(); // This is possible as the non-static method always belongs to the instance of the class
        System.out.println("Hey!! You are learning Quick");
        // Non-Static Variable greeting requires the instance of the class i.e object to access it
        // Non-static methods cannot be accessed inside static method you need the instance of the class
    }

    void advanced() {
        System.out.println("You are the best person that i have ever met");
    }
}

