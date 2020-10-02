package hacker_earth;

import java.util.*; 

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
        if((long)x.x*y.y - x.y*y.x > 0) return 1; 
        else if((long)x.x*y.y - x.y*y.x < 0) return -1; 
        else return 0; 
    } 
}

class CSort {
    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        int n = s.nextInt(), x, y;
        Pair[] arr = new Pair[n];
        
        for(int i=0;i<n;i++) {
            x = s.nextInt();
            y = s.nextInt();
            arr[i] = new Pair(x, y);
        }

        for(int i=0;i<n;i++) {
            System.out.printf("%d: (%d, %d)\n", i, arr[i].x, arr[i].y);
        }
        System.out.println();

        Arrays.sort(arr, new CCompare());

        for(int i=0;i<n;i++) {
            System.out.printf("%d: (%d, %d)\n", i, arr[i].x, arr[i].y);
        }
        System.out.println();

        s.close();
    }
}