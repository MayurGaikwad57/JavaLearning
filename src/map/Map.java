package map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        /* Allows Null:One null key is allowed.Multiple null values are allowed.
         Unordered: The elements in a HashMap are not stored in any specific order.
         HashMap is not thread-safe. For concurrent access,
         you should use ConcurrentHashMap or synchronize the HashMap externally.
         No Duplicate Keys: You cannot have duplicate keys in a HashMap.
         If you attempt to insert a new entry with a key that already exists,
         it will overwrite the existing key’s value.
         */

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Mayur");
        map.put(2,"Anil");
        map.put(2,"Elvish");
        // as we are trying to insert the duplicate keys and,the values are overwrittten
        map.put(3,"Anil"); // in hashMap keys are unique and values can be duplicate
        map.put(4,"Vivek");
//        map.put(null,"Wagh");// one null key is allowed
//        map.put(5,null); // null values are allowed
//        map.put(6,null); // multiple null values are allowed
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.get(31));
        // answer will be null as the key is not present inside the map

        System.out.println(map.containsKey(2)); // output will be boolean based on key's presence or absence
        System.out.println(map.containsValue("Mayur"));
        // this is case sensitive and should match the exact values inside the map
        // It's output will be boolean true/false

        // Iterating over hashMap
        for(int i :  map.keySet()) {
            System.out.println(map.get(i));
        }
        System.out.println("Before Removing from map");
        map.remove(1);
        for(int i :  map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}
