import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // switch case in java
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
// In switch case const or literal should match the expression inside switch
// Here literal is fruit that matches expression in switch(fruit)
// Type of case should be same type defined for literal
// In our case fruit is string so you can see case type is also string
// Duplicate cases are not allowed (IMP)
// Default will run when no cases match the given value always at last
// Break is necessary otherwise rest of the cases will also run
        switch (fruit) {
            case "Mango":
                System.out.println("King of all Fruits");
                break;
            case "Apple":
                System.out.println("Apple Fruit");
                break;
            case "Banana":
                System.out.println("Banana Fruit");
                break;
            case "Mosambi":
                System.out.println("Mosambi Fruit");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }

        // modern day switch case (Provides more cleaner code to us)
        // use case -> 1) More cleaner code
        // 2) can also include complex logic if needed
        // 3) No break statement needed as it comes inbuilt
        // 4)
        Scanner input = new Scanner(System.in);
        int obj = in.nextInt();

        switch(obj) {
            case 1 ->{
                System.out.println("Monday");
                System.out.println("Complex logic can also be included in modern switchMango");
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input!! Please enter valid day from 1 to 7");
        }
    }
}
