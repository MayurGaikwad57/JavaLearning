package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
      // Linked List JCF
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println("The first element is :"+ linkedList.getFirst());
        System.out.println("The Last Element is :"+linkedList.getLast());
        linkedList.removeFirst(); // removes the first element from the list
        linkedList.remove(3); // the 3rd index element is removed

//        System.out.println("The Entire Linked List is:"+linkedList);
        // we can either add elements in the above way or anothere way is possible
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Lion","Giraffe","Dog","kingKong"));
        LinkedList<String> removeList = new LinkedList<>(Arrays.asList("Lion","Dog"));
        // using remove all method to remove the elements
        list.removeAll(removeList);
        System.out.println("Animals are:"+list);
        // output is giraffe , kingKong
    }
}
