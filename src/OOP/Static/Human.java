package OOP.Static;

public class Human {
    String name;
    int age;
    boolean married;
    int salary;
   static long population;
   // Static Variables are the ones which are independent of the objects of the class
    // Meaning , they are common to all the objects of the class
    // they are needed to be accessed via class name not using this keyword

    static void involve() {
//        System.out.println(this.age); //you cannot use this here it has to be avoided
        // as this refers to the object of the class
        //and static methods or variables are independent of the class
    }

    Human(String name , int age, boolean married, int salary) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.salary = salary;
        Human.population += 1;
    }
}
