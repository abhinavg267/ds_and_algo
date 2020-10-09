package algorithms.sorting;

import java.util.ArrayList;
import java.util.Scanner;

class MergeSort {
    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> merged = new ArrayList<Integer>();
        int i=0, j=0;
        while(i<left.size() || j<right.size()){
            if(i<left.size() && j<right.size()) {
                if(left.get(i)<right.get(j)) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            } else if(i<left.size()) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }
        return merged;
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr) {
        if(arr.size()<=1) return arr;
        else {
            int m = arr.size()/2;
            ArrayList<Integer> left = mergeSort(new ArrayList<Integer>(arr.subList(0, m)));
            ArrayList<Integer> right = mergeSort(new ArrayList<Integer>(arr.subList(m, arr.size())));
            return merge(left, right);
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
            System.out.println(mergeSort(A));
        }
        s.close();
    }
}