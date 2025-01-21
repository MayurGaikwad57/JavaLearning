package enumjava;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        for(int a : arr) {
            System.out.println(a);
        }


//        Day instance = Day.Monday;
//        // if you want to get the index of the list element from enum
//        // enum is basically used to store the list
//        int ordinal = instance.ordinal();
//        System.out.println(ordinal);
//        System.out.println(instance.name());
//        Day enumDay = Day.valueOf("Tuesday");
//        System.out.println(enumDay);
//        Day[] values = Day.values();
//        for(Day i : values) {
//            System.out.println(i);
//        }

    }
}
