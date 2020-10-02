// https://www.hackerearth.com/problem/algorithm/deep-loves-function-minimization-ac5a3463/

package hacker_earth;

import java.util.*; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

class FastReader { 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() { 
        br = new BufferedReader(new
                 InputStreamReader(System.in)); 
    } 

    String next() { 
        while (st == null || !st.hasMoreElements()) { 
            try { 
                st = new StringTokenizer(br.readLine()); 
            } catch (IOException  e) { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() { 
        return Long.parseLong(next()); 
    } 

    double nextDouble() { 
        return Double.parseDouble(next()); 
    } 

    String nextLine() { 
        String str = ""; 
        try { 
            str = br.readLine(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
} 

// User defined Pair class 
class Pair { 
    int x; 
    int y; 

    public Pair(int x, int y) { 
        this.x = x; 
        this.y = y; 
    } 
}


class CCompare implements Comparator<Pair> { 
    @Override public int compare(Pair x, Pair y) { 
        if((long)x.x*y.y - (long)x.y*y.x > 0) return 1; 
        else if((long)x.x*y.y - (long)x.y*y.x < 0) return -1; 
        else return 0; 
    } 
}

class Minimization {
    public static void main(final String[] args) {
        final FastReader s = new FastReader();

        long M = 1000000007;

        int t = s.nextInt();
        while(t-->0) {
            int n = s.nextInt();
            int[][] arrA = new int[3][n];
            Pair[] arrB = new Pair[n];
            for(int i=0;i<3;i++) {
                for(int j=0;j<n;j++) {
                    arrA[i][j] = s.nextInt();
                }
            }
            for(int i=0;i<n;i++) {
                arrB[i] = new Pair(arrA[0][i], arrA[1][i] * arrA[2][i]);
            }

            Arrays.sort(arrB, new CCompare());

            long partial_sum = 0L, sum = 0L;
            for(int i=n-1; i>0; i--) {
                partial_sum = (partial_sum + (long)arrB[i].y)%M;
                sum = (sum + ((long)arrB[i-1].x * partial_sum)%M)%M;
            }

            System.out.println(sum);
        }
    }
}