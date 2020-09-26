package basics;

import java.util.Scanner;

/**Input
 * 1
 * 2
 * A long string
 */

class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int array[], n;
        // n = scanner.nextInt();
        // array = new int[n];
        // for (int i=0;i<n;i++) {
        //     array[i] = scanner.nextInt();
        // }

        // for (int i=0;i<n;i++) {
        //     System.out.print(array[i] + ", ");
        // }

        int n = s.nextInt();
        int m = s.nextInt();
        s.nextLine();
        String str = s.nextLine();

        int x = Integer.parseInt("56");

        System.out.println(n + " " + m + " " + str + " " + x);

        // int i = s.nextInt();
        // double d = s.nextDouble();
        // // s.nextLine();
        // String str = s.nextLine();

        // System.out.println("String: " + str);
        // System.out.println("Double: " + d);
        // System.out.println("Int: " + i);

        s.close();
    }
}