package data_structures;

import java.util.*;

// Set implements Collection interface
class SetInteface {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 4, 5, 9}));

        System.out.println(set);

        set.add(6);
        System.out.println(set);

        set.add(5);
        System.out.println(set);

        set.remove(6);
        System.out.println(set);

        System.out.println(set.contains(4));

        System.out.println(set.toArray(new int[0]));
    }
}
