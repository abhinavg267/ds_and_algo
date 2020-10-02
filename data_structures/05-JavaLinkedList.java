package data_structures;

import java.util.*; 
  
class JavaLinkedList { 
  
    public static void main(String args[]) 
    { 
        // Creating object of the 
        // class linked list 
        LinkedList<Integer> linkedList = new LinkedList<Integer>(); 
  
        // Adding elements to the linked list 
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addFirst(3);
        linkedList.addLast(4);
        linkedList.add(3, 5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(6);
  
        System.out.println(linkedList); 
        linkedList.remove();
        System.out.println(linkedList); 
        linkedList.removeFirst();
        System.out.println(linkedList); 
        linkedList.remove(Integer.valueOf(6));
        System.out.println(linkedList); 
    } 
}