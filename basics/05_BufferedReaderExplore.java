package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BufferedReaderExplore {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
        System.out.println(n);
    }
}
