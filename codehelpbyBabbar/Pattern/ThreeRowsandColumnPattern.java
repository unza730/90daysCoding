package Pattern;

import java.util.Scanner;

public class ThreeRowsandColumnPattern {
    public static void main(String[] args) {
        // ForLoop(args);
        // WhileLoop(args);
        // Pattern2(args);
        // Pattern3(args);
        Pattern4(args);
    }

    public static void ForLoop(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows and columns");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("*");

            }
            System.out.println();
        }
    }

    public static void WhileLoop(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int num = sc.nextInt();
        sc.close(); // Close the scanner after reading input

        int i = 0;
        while (i < num) {
            int j = 0;
            while (j < num) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void DoWhile(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int num = sc.nextInt();
        sc.close(); // Close the scanner after reading input

        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j < num);
            System.out.println();
            i++;
        } while (i < num);
    }

    // 1111
    // 222
    // 33
    // 4
    public static void Pattern2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of patterns");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            int j = i;
            while (j <= num) {
                System.out.print(i);
                // if System.out.print(j);
                // output will be:
                // 1234
                // 234
                // 34
                // 4
                // But in case System.out.print(i);
                // so output will be:
                // 1111
                // 222
                // 33
                // 4
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static void Pattern3(String[] args) {
            //   (j=1)   (j=2)     (j=3)
        // (i=1) => 1     2          3
        // (i=2) => 1     2          3
        // (i=3) => 1     2          3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Pattern");
        int num = sc.nextInt();
        int i=1;
        while(i<=num){
        int j = 1;
        while(j<=num){
           System.out.print(j);
           j++;
        }
        System.out.println("");
         i++;
    }
    }
    public static void Pattern4(String[] args) {
            //   (j=1)   (j=2)     (j=3)
        // (i=1) => 1     2          3
        // (i=2) => 1     2          3
        // (i=3) => 1     2          3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Pattern");
        int num = sc.nextInt();
        int i=num;
        while(i>=num){
        int j = num;
        while(j>=num){
           System.out.print(j);
           j--;
        }
        System.out.println("");
         i--;
    }
    }

}
