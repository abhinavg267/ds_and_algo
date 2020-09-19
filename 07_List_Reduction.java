/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

import java.util.HashSet;
import java.util.Set;


class List_Reduction {
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 

    public static void main(String args[] ) throws Exception {
        Reader s = new Reader();
        int n = s.nextInt();
        int k = s.nextInt();

        long sum = 0, a;

        PriorityQueue<Long> maxHeap = new PriorityQueue<Long>(n, Collections.reverseOrder());
        PriorityQueue<Long> minHeap = new PriorityQueue<Long>(n);

        // Set<Long> oldElem = new HashSet<Long>(); 

        for(int i=0;i<n;i++) {
            a = s.nextLong();
            maxHeap.add(a);
            minHeap.add(a);
        }

        while(k-->0) {
            long max = maxHeap.poll();
            // while(oldElem.contains(max)) {
            //     max = maxHeap.poll();
            // }

            long max2 = maxHeap.poll();
            // while(oldElem.contains(max2)) {
            //     max2 = maxHeap.poll();
            // }
  
            if(max%2==1 && max2==max-1) {
                maxHeap.add(max);
                maxHeap.add(max2/2);
                minHeap.add(max2/2);
                // oldElem.add(max2);
            } else {
                maxHeap.add((max+1)/2);
                maxHeap.add(max2);
                // oldElem.add(max);
                minHeap.add((max+1)/2);
            }

            long min = minHeap.poll();
            // while(oldElem.contains(min)){
            //     min = minHeap.poll();
            // }
            minHeap.add(min*2);
            // oldElem.add(min);
            maxHeap.add(min*2);
        }

        Iterator<Long> itr = maxHeap.iterator();
        while(itr.hasNext()) {
            long l = itr.next();
            sum += l;
            // if(!oldElem.contains(l)) {
            //     sum += l;
            // } 
            // System.out.print(l + ", ");
        }

        // System.out.println("");

        // Iterator<Long> itr2 = minHeap.iterator();
        // while(itr2.hasNext()) {
        //     System.out.print(itr2.next() + ", ");
        // }
        System.out.println(sum);
    }
}