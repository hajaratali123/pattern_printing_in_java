import java.util.Scanner;

public class SatarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m and n :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print("*");

            }
            System.out.println();


        }
    }
}
