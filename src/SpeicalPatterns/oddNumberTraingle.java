package SpeicalPatterns;

import java.util.Scanner;

public class oddNumberTraingle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        System.out.println("Odd number triangle :");
        // By mathematical formula
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(2*j-1+" ");

            }
            System.out.println();
        }
        // by changing the increment value
        System.out.println("by changing the increment value");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=2*i-1; j+=2) {
                System.out.print(j+" ");

            }
            System.out.println();
        }

        // by taking another variable as temp
        System.out.println("by taking another variable as temp");

        for (int i = 1; i <=n; i++) {
            int temp = 1;
            for (int j = 1; j<=i; j++) {
                System.out.print(temp);
                temp= temp+2;

            }
            System.out.println();
        }



    }
}
