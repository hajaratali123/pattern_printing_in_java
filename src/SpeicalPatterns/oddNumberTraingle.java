package SpeicalPatterns;

import java.util.Scanner;

public class oddNumberTraingle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        System.out.println("Odd number triangle :");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(2*j-1);

            }
            System.out.println();
        }
    }
}