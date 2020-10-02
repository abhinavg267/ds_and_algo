package data_structures;

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair that = (Pair)obj;
            return that.x == this.x && that.y == this.y;
        }
        return false;
    }
}

class StringBasics {
    public static void main(String[] args) {
        String s1 = new String("Hello World");
        String s2 = new String("Hello World");
        System.out.println(s1==s2);

        Pair p1 = new Pair(1, 2);
        Pair p2 = new Pair(1, 2);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1==i2);
    }
}