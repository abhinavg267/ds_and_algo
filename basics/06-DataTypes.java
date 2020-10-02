package basics;

class DataTypes {
    public static void main(String[] args) {
        int i = 2<<14;
        System.out.println((long)i*i*2 - i*i*2);
        System.out.println(1e9+7);
    }
}