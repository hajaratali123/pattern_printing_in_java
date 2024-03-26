import java.util.Scanner;

public class alphabetsSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();


        System.out.println("Upper Case alphabets");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j+64)+" ");

            }
            System.out.println();
        }

        System.out.println("Lower Case alphabets ");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j+96)+" ");

            }
            System.out.println();
        }

        System.out.println("Upper Case alphabets 2");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i+64)+" ");

            }
            System.out.println();
        }

        System.out.println("Upper Case alphabets 2 ");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i+96)+" ");

            }
            System.out.println();
        }
    }
}
