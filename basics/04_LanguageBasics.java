package basics;

class LanguageBasics {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            if(i>4 && i<7) continue;
            System.out.println("A" + i);
            System.out.println("B" + i);
        }
    }
}