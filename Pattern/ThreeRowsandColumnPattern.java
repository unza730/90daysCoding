package Pattern;
import java.util.Scanner;
public class ThreeRowsandColumnPattern {
    public static void main(String[] args) {
        ForLoop(args);
        WhileLoop(args);
    }
    public static void ForLoop(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows and columns");
        int num = sc.nextInt();
        for(int i = 0; i< num; i++){
         for(int j=0; j<num; j++){
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
}
