package basics;

import java.util.Scanner;

class Template {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        System.out.println(N);

        scanner.close();
    }
}