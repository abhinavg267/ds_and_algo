package algorithms.sorting;

import java.util.ArrayList;
import java.util.Scanner;

class QuickSort {
    public static ArrayList<Integer> quickSort(ArrayList<Integer> A){
        if(A.size() <= 1) return A;
        else {
            int pivot = A.get(A.size()-1);
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();
            for(int i=0; i<A.size()-1; i++) {
                int e = A.get(i);
                if(e<=pivot) {
                    left.add(e);
                } else right.add(e);
            }
            ArrayList<Integer> sorted = quickSort(left);
            sorted.add(pivot);
            sorted.addAll(quickSort(right));
            return sorted;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while(q-->0) {
            int n = s.nextInt();
            ArrayList<Integer> A = new ArrayList<Integer>();
            for(int i=0;i<n;i++) {
                A.add(s.nextInt());
            }
            System.out.println(quickSort(A));
        }
        s.close();
    }
}