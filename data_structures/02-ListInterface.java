package data_structures;

import java.util.*;

class ListInterface {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        // List<Integer> vector = new Vector<Integer>();
        // List<Integer> linkedList = new LinkedList<Integer>();

        Random rand = new Random();

        for(int i=0;i<10;i++) {
            arrayList.add(rand.nextInt(100));
        }

        System.out.println(arrayList.toString());
        // add(index, value)
        // remove(value)
        // remove(index)

        arrayList.sort(null);

        Iterator<Integer> itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.printf("%d, ", itr.next() + 1);
        }
        System.out.println();

        System.out.println(arrayList.toString());
    }
}
