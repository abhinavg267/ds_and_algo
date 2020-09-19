import java.util.Scanner;

class Lex {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            final String pat = scanner.nextLine();
            final int n = pat.length();
            String res = "";
            for (int i=0;i<n;i++){
                int ic=i;
                while(ic < n && pat.charAt(ic) =='>') {
                    ic++;
                }
                for (int j=ic; j>=i; j--) {
                    res = res + (char)(97+j);
                }
                i=ic;
            }
            if(pat.charAt(n-1) == '<') {
                System.out.println(res + (char)(97+n)); 
            } else {
                System.out.println(res); 
            }
        }
        scanner.close();
    }
}