package data_structures.arrays;

import java.util.*;

class NobelInteger {
    static int solve(ArrayList<Integer> A) {
        int n = A.size();
        A.sort(null);
        int res = -1;
        for(int i=0;i<n;i++){
            if(A.get(i)==(n-i-1)) {
                System.out.println(i + ": " + A.get(i) + " " + (n-i-1));
                if(i!=n-1 && A.get(i+1)>A.get(i)) res = 1; 
                else if(i==n-1 && A.get(i)==0) res = 1;
            }
        }
        // System.out.println(A.subList(174, n));
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0));
        System.out.println(solve(A));
    }

}