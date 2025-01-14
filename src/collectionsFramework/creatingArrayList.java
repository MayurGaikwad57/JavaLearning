package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class creatingArrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(); // one way of creating array list
//        //ArrayList<Integer> List = new ArrayList<>(list2 or initialCapacity);
//        // in ArrayList the parameters can either be another ArrayList or initialCapacity
//        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday","tuesday","Wednesday");
        System.out.println(list1.getClass().getName());
        // java.util.Arrays$ArrayList here ArrayList is a nested private class and hence we cannot acces it
//         list1.set(1,"Sunday");
         // the asList returns a fixed size list hence we can replace the values but cannot add or remove
        // the elements from the list
        System.out.println(list1.get(1));
//        list1.add("Friday"); this will give exception error to us



        String[] arr = {"Mano,Pineapple","Banana","Grapes"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2.getClass().getName());
        list2.set(2,"chickoo"); // same thing goes here also asList returns a fixed size list
        // so we cannot add or remove the elements but replace those elements
//        System.out.println(list2.get(2));


        List<String> list4 = new ArrayList<>(list2);
        System.out.println(list4);




        List<Integer> list3 = List.of(5,6,7,8,9);
//        list3.set(1,5); //Immutable object is modified
        // the above line will throw exception error

        // AddAll method in ArrayList
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
////        list.add(1,25);You can do these also add or any element at any index
//        list.add(3);
//        list.add(4);
//
//        list.addAll(list3); // add all method adds all the elements in the list
//        // above here we have passed list3 which contains 5 to 9 elements
//        System.out.println(list);

//        list.add("Apple");
//        list.add("Mango");
//        list.add("Banana");
//        list.add("Grapes");
//
//        list.remove("Mango"); // here actually the object is passed not the index
//        // hence mango is removed from the list
//        System.out.println(list);
//

        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);

//      list.remove(2);
      // here the element at index 2 will be removed as the index 2 is passed to remove method
//        But if you want the element to get deleted you can use the Integer.value(i:index)

        list.remove(Integer.valueOf(3));
        // here now the first occurence of the element 3 will be deleted
        System.out.println(list);

    }

}
