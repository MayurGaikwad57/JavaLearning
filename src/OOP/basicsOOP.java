package OOP;

public class basicsOOP {
    // Interview Question : Why dont we store primitive data types in heap memory
    // ans -> To inscrease efficiency of java application we dont store primitve data types in
    // heap , instead they are stored in stack and hence we also dont use new keyword with them
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Student obj1 = new Student();
        Student random = new Student(15,20.00f,"KingKong");
//        obj1.rno = 15;
//        obj1.marks = 25.00f;
//        obj1.Name = "Mayur";
//        System.out.println("Roll No :"+ obj1.rno);
//        System.out.println("Marks are:"+obj1.marks);
//        System.out.println("Name is :"+obj1.Name);
//
//        random.changeName("DonBosco");
//        System.out.println(random.Name);

//        Student replace = new Student(obj1);
//        System.out.println(replace.Name);

        Student newRandom = new Student();
        System.out.println(newRandom.Name);
    }
}

class Student {
    int rno;
    float marks;
    String Name;

    void changeName(String Name) {
        this.Name = Name;
    }
  // Creating a default Constructor
//    Student() {
//        this.rno = 200; // This refers to the current context of execution
//        this.marks = 45.00f;
//        this.Name = "Anil";
//    }

    // Calling a constructor form anothere constructor
     Student() {
       this  (10,25,"JonCena");
       // Internal Implementation is this will be repplaced with the
   // new Student(rno,marks,Name)  this is how we can call anothere constructor

     }

    // Case where we want to populate our object properties with the values from
    // an anothere Object
    /* In above cases we are either setting the values explictly
      i.e default constructor Student() using obj.name , obj.rno etc
      * In second case we saw about parameterized constructor
       Student(// passing params here) and then printing its values
       * Now in 3rd case we will take an object and assign values of that object to our class
       properties i.e we will pass object as an parameter and assign its values to our
       new object that we have
 */
    Student(Student other){
        this.Name = other.Name; // successfully working name property accessed here form obj1
    }


    Student(int rno, float marks, String Name) {
        this.rno = rno;
        this.marks = marks;
        this.Name = Name;
    }
// Calling a constructor from anothere constructor

}
