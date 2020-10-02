package data_structures;

import java.util.Random;
import java.util.Stack;

class JavaStack {
    static int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Random rand = new Random();

        for(int i=0;i<9;i++) {
            stack.push(rand.nextInt(MAX_RANDOM));
        }

        System.out.println(stack.toString());
        System.out.println("Peeking: " + stack.peek());
        System.out.println(stack.toString());
        System.out.println("Popping: " + stack.pop());
        System.out.println(stack.toString());
    }
}
