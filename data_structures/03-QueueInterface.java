package data_structures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

class QueueInterface {
    static int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        Random rand = new Random();

        for(int i=0;i<9;i++) {
            queue.add(rand.nextInt(MAX_RANDOM));
        }

        System.out.println(queue.toString());
        System.out.println("Peeking: " + queue.peek());
        System.out.println(queue.toString());

        while(!queue.isEmpty()) {
            System.out.printf("%d, ", queue.poll());
        }
    }
}