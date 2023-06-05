package Pattern;
import java.util.Scanner;
public class ThreeRowsandColumnPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows and columns");
        int num = sc.nextInt();
        for(int i = 0; i< num; i++){
         for(int j=0; j<num; j++){
         System.out.println("*");
           
         }
         System.out.println();
        }
    }
}
