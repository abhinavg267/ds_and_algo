package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

class InsertionSort {
    public static void swap(ArrayList<Integer> A, int i, int j) {
        int tmp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, tmp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 6, 4, 8, 4, 3, -5, 6));

        for(int i=0;i<A.size();i++) {
            int min = A.get(i), min_idx = i;
            for(int j=i+1; j<A.size(); j++) {
                if(A.get(j)<min) {
                    min = A.get(j);
                    min_idx = j;
                }
            }
            swap(A, i, min_idx);
        }

        System.out.println(A);
    }
}