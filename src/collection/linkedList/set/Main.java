package collection.linkedList.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       // set in java
       // duplicate values are not allowed in set
       // set doesn't give sorted elements
//        Set<Integer> newSet = new HashSet<Integer>();
// If you want to get sorted set elements you can use treeSet
    Set<Integer> newSet = new TreeSet<>();
    newSet.add(46);
    newSet.add(34);
    newSet.add(22);
        newSet.add(10);
        newSet.add(20);
        newSet.add(30);
        newSet.add(40);
        newSet.add(50);
        newSet.add(10);
        newSet.add(20);
        System.out.println(newSet.contains(46));
        for(int a : newSet) {
            System.out.println(a);
        }
    }
}
