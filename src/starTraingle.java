import java.util.Scanner;

public class starTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        System.out.println("printing Stars * ");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }


        System.out.println("Printing numbers ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }


        System.out.println("printing Alphabets Upper case ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <=i; j++) {
                System.out.print((char)(j+64));

            }
            System.out.println();
        }

        System.out.println("printing Alphabets lower case ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <=i; j++) {
                System.out.print((char)(j+96));

            }
            System.out.println();
        }

        System.out.println("Mixed Triangle ");
        for (int i = 1; i <= n+1; i++) {
            for (int j = 1 ; j <=i; j++) {
                if(i%2==0){
                    System.out.print((char)(j+64)+" ");


                }
                else{
                    System.out.print(j+" ");
                }


            }
            System.out.println();
        }


    }
}
