package basicJava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
    /* Typecasting in Java,
     NOTE--> Java performs internal typecasting also
      Based on two conditions this happens
      1) The both of data type must be compatible
      2) the dataType in which you want to store the type conversion
      must be bigger than the converted dataType
      for example -> if you want to store float data type in integer than it won't happen
      as float is bigger than int same goes with others also
         */
        Scanner input = new Scanner(System.in);
  /*         int a = input.nextFloat();
         This type conversion will not happen as
        we expect float but we are storing that in integer hence fails
         Integer is smaller than float so fails    */
        // Successfull case (Where automatic type conversion by java)
//        System.out.println("Please enter integer : ");
        float a = input.nextInt();
        System.out.println(a); // this works gives output in floating point value
        // Reason float > int and both types are compatible with each other
        // if you try char, string it will fail as they are not compatable with float

        // Acheiving typecasting in java (Custom)
        int num = (int) (2.3456f);
//        System.out.println(num);

        byte l = 20;
        byte m = 40;
        byte n = 80;

        int o = l * m / n;
        System.out.println(o);
        /* The above type conversion works because java automatically casts
         expression l*m into a integer
         so whatever like byte,char or short in expressions will be automatically evaulated
         to integer
         Explanation--->
         Promotion to int

In Java, when you perform arithmetic operations (+, -, *, /) on variables of types byte, char, or short, they are automatically promoted to int during the calculation.
This rule ensures consistent behavior and avoids overflow issues since an int can represent a much larger range than byte.
Expression Evaluation

The multiplication l * m evaluates to 800 because both l and m are promoted to int before the multiplication.
The result of l * m is an int (800).
The division 800 / n is then performed, with n also promoted to int, resulting in 10.
Assignment to int o

Since o is declared as int, the result of the expression 800 / 80 (which is 10) can be directly assigned without any explicit type casting.

 */
/*Key Concept: Type Promotion Rules
In Java:

If any operand in an expression is int or smaller (byte, short, char), all operands are promoted to int.
If any operand is long, the result is promoted to long.
If any operand is float, the result is promoted to float.
If any operand is double, the result is promoted to double.
This promotion happens to ensure precision and consistency during calculations.
*/

    }
}
