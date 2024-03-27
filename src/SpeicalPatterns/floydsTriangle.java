package SpeicalPatterns;

import java.util.Scanner;

public class floydsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        int a = 1;
        System.out.println("floyd's Triangle ");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(a+" ");
                a =a+1;

            }
            System.out.println();
        }
    }
}
