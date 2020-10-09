package basics;

class AnotherClass {
    {
        System.out.println("AnotherClass: Static Block 1");
    }
    {
        System.out.println("AnotherClass: Static Block 2");
    }
    AnotherClass() {
        System.out.println("AnotherClass: Constructor");
    }
}

class DoubleMain {
    {
        System.out.println("Static Block");
    }
    DoubleMain() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        System.out.println("Main Menthod");
        AnotherClass ac = new AnotherClass();
    }
}
