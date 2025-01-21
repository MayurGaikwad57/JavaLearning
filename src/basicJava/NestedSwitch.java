package basicJava;

import java.util.Scanner;

public class NestedSwitch {
    //nested switch in java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int emp_Id = in.nextInt();
        String emp_Dept = in.next();

        switch(emp_Id) {
            case 1 -> System.out.println("Mayur");
            case 2 -> System.out.println("Anil");
            case 3 -> {
                System.out.println("king Kong");
                switch (emp_Dept) {
                    case "IT" -> System.out.println("IT Dept");
                    case "ENTC" -> System.out.println("ENTC Dept");
                    case "HR" -> System.out.println("HR Dept");
                    default -> System.out.println("No matching Dept found");
                }
            }
            case 4 -> System.out.println("Pushpak");
        }
    }
}
