package OOP;

public class BasicsOOP {
    public static void main(String[] args) {
       Student obj = new Student();
        Student random = new Student(10,15.00f,"legend");
//       obj.id = 15;
//       obj.marks = 20.00f;
//       obj.rno =21;
        System.out.println("Roll No is :"+random.rno);
        System.out.println("Marks are :"+random.marks);
        System.out.println("Roll no is :" + random.name);

//        Student random = new Student(10,15.00f,"legend");
//        obj.changeName("Virat");
//        obj.greeting();
    }

}
class Student {
    int rno ;
    float marks;
    String name;

    void changeName(String newName) {
         name = newName;
    }

     // function named greeting
     void greeting() {
         System.out.println("Welcome Legend :"+this.name);
     }


    // Creating Constructor
    Student() {
        this.rno = 10;
        this.marks = 25.00f;
        this.name = "Mayur";
    }
    Student(int rno, float marks , String name) {
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }
}
