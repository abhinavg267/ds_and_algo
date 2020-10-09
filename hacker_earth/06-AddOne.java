package hacker_earth;

import java.util.*;


class AddOne {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 0, 9, 9, 9));
		
		int carry=1;
        for(int i=A.size()-1; i>=0; i--){
            int cur = A.get(i)+carry;
            A.set(i, cur%10);
            carry = cur/10;
        }

        ArrayList<Integer> B = new ArrayList<Integer>();
        
        if(carry>0) {
            B.add(1);
            B.addAll(A);
        } else {
            B.addAll(A);
        }

        int l=0;
        for(int i=0;i<B.size();i++) {
            if(B.get(i)==0) {
                l++;
            } else break;
        }
        System.out.println(B.subList(l, B.size()));
	}
}

