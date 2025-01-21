package string;

public class Equals {
    int number;
    public Equals(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        return this.number == ((Equals)obj).number;
    }

    // all about == and equals() in java
    public static void main(String[] args) {
       /* 1. The == Operator
    The == operator checks whether two references point to the same memory location.
    When used with primitive types, it compares their values directly.
    For objects, it checks reference equality (i.e., whether both references point to the exact same object in memory).
       */
//        int a = 5;
//        int b = 5;
//        System.out.println(a==b); // output as true

//        String c = new String("Mayur");
//        String d = new String("Mayur");
//        System.out.println(c == d); // output as false
        /*Here, a and b are created using the new keyword, which forces Java to create two different objects in memory,
         even if their contents are the same.
         The == operator checks references and finds that they are different.
          */

//        String e ="Mayur";
//        String f = "Mayur";
//        System.out.println(e==f); // output as true
        /* In the above case, the result is true because:
         Java uses a String Pool. When two string literals have the same value,
         Java optimizes memory by storing only one instance in the pool
          and pointing both references to it.
         */

        /* 2. The equals() Method
        The equals() method is defined in the Object class and is used to compare the contents of two objects.
        Default Behavior:
        If not overridden, the equals() method behaves just like == (it checks reference equality). However, many classes (e.g., String, Integer) override equals() to compare values instead of references.
        */
//        String name1 = new String("Anil");
//        String name2 = new String("Anil");
//
//        System.out.println(name1.equals(name2));
//        System.out.println(name1 == name2);
        // output will be false as both the objets name1 and name2
        // reference different memory locations

        // KEY NOTE
        // You can use ==  in objects to check if two objects reference(point)
        // at the same memory location


        Equals obj = new Equals(35);
        Equals obj1 = new Equals(35);
        System.out.println(obj.equals(obj1));

        /*                String Methods in java
        * 1) All String methods create a new string
        * 2) Strings are immutable in java
        * */
        // substring method to create the substring,
        String newString = "You are Legend";
        // String latest = newString.substring(4)
        // starts from 4 and goes till length-1;
        String latest = newString.substring(4,10);
        // 10 here is not included , it is excluded meaning (4,10]
        System.out.println(latest);

        String trimString = "   king kong";
        System.out.println( trimString.trim());
        System.out.println(trimString); //main string is unaffected

        // replace method in string
//        String wantReplace = "Anil Poul Anil Anil Anil";
//        String getReplacement = wantReplace.replace("Anil","Jon Cena");
        /*Replacement is case sensitive so make sure to provide proper strings*/
//        System.out.println(getReplacement);
// similar like this not only word but a letter can also be replaced
        String replace = "Pawar Prasad";
        String power = replace.replace("r","a");
        System.out.println(power);

        String str = "    ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}
