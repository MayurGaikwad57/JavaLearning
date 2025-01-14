package collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /* Array List is part of JCF
        1) Its default capacity is 10, Capacity refers to the size of internal array which can hold
        the elements before needing to resize
        2) Internally ArrayList is stored as array of object references , when you add the elements to ArrayList
        they are stored in an array internally
 Mechanism of adding Elements to the array
1) Check Capacity -> Before adding the element to the array , first the capacity of array will be checked
if there is enough space to add the element then it will be added
2) Resize if Necessary -> if there is not enough space inside the array then the array will be resized
usually(1.5 times) of the current capacity and copy the elements from the old array and store it inside the
new array
3) Add Element -> the element is then added at the appropriate index , and the size of array is incremented
4) Time Complexity of this operation is O(n) as elements will be copied form the old array and put inside the new array

Mechanism to remove the elements
1)CheckAvailability -> ArrayList first checks that the index is within the valid range
2) Remove the elements -> The element is then removed and the elements to the right of the removed element are shifted
one position to the left to fill the gap
3)Reduce Size -> the size is then decremented by 1

                                     */
        ArrayList<Integer> list = new ArrayList<Integer>();
//      ArrayList<Integer>  list = new ArrayList<>(initialCapacity:1000)
//  InitialCapacity is to be given when we know that atmost we can have these many elements inside array
//  The moment more elements are added than the initialCapacity that you mentioned the array will be resized
// Mentioning initialCapacity is good practice for efficient utilization of memory
        // after java 7 we dont have to mention this Integer i.e type in new ArrayList<Integer>
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(45);

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

//        for(int i= 0; i< list.size();i++) {
//            System.out.println(list.get(i));
//            // looping through the list and accessing all the elements of list
//        }

        // modern for each loop can also be used
        // here x not index but the element itself
//        for(int x : list){
//            System.out.println(x);
//        }

        // We can also check if the element exists in the list or not
//        System.out.println(list.contains(20)); // output true as 20 is present in the list
//        System.out.println(list.contains(100)); // output false as 100 is not present in list

//        list.remove(2); // this will remove the element at index 2
//        for(int x : list){
//            System.out.println(x); // element at index 2 , 30 is removed from the list
//        }

//        list.add(2,100);
//        // will add 100 at index 2 , and the rest of elements will move down the order in arrayList
//        for(int x : list){
//            System.out.println(x); // added 100 at index 2
//        }

//        list.set(2,21);
//        // set method will replace the 2nd index element with 21
//        // It is same as the add method but the difference is in add method the number is not added
//        // and rest of the elements are moved based on that
//        for(int x : list){
//            System.out.println(x);
//        }
        System.out.println(list.size());

        // Converting List to Array
 ArrayList<Integer> convert = new ArrayList<>();
 convert.add(1);
 convert.add(2);
 convert.add(3);

        Integer[] array = convert.toArray(new Integer[0]);
       // (new Integer[0] is passed here as we tell what type of array we want)

        // sorting an ArrayList
        // collections.sort(list) sorts in natural order

        ArrayList<Integer> sorting = new ArrayList<>();
        sorting.add(5);
        sorting.add(9);
        sorting.add(1);
        sorting.add(3);

//        Collections.sort(sorting); // we are using sort method of collections class
//        System.out.println(sorting);
         sorting.sort(null); // this also works for sorting
        System.out.println(sorting);

    }
}
