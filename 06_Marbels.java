import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

class Marbels {
    static class FastReader { 
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

    public static void main(String args[] ) throws Exception {
        FastReader s = new FastReader(); 
        int n = s.nextInt();
        long[] arr = new long[n];

        arr[0] = s.nextLong();

        for(int i=1;i<n;i++) {
            arr[i] = arr[i-1] + s.nextLong();
        }

        int q = s.nextInt();

        while(q-->0) {
            long idx = s.nextLong();
            int l=0, r=n-1;
            while(l<r) {
                int m = l + (r-l)/2;
                if(arr[m]>=idx) r = m;
                else l = m+1;
            }
            System.out.println(r+1);
        }
    }
}
