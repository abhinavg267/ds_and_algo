import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[], n;
        n = scanner.nextInt();
        array = new int[n];
        for (int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }

        for (int i=0;i<n;i++) {
            System.out.print(array[i] + ", ");
        }
        scanner.close();
    }
}