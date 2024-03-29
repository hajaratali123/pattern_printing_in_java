package compositePatterns;

import java.util.Scanner;

public class numberTriangleVerticallyFlipped {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        System.out.println("printing Stars * ");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
