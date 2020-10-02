package oop_concepts;

interface PI1 { 
    int i = 4;
    default void show() { 
        System.out.println("Default PI1"); 
    } 
} 
  
interface PI2 { 
    // default void show() { 
    //     System.out.println("Default PI2"); 
    // } 
} 
  
class MultipleInheritence implements PI1, PI2 
{ 
    // public void show() { 
    //     PI1.super.show(); 
    //     PI2.super.show(); 
    // } 
  
    public static void main(String args[]) { 
        MultipleInheritence d = new MultipleInheritence(); 
        d.show(); 
    } 
} 