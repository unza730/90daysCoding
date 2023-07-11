package Pattern;

import java.util.Scanner;

public class ThreeRowsandColumnPattern {
    public static void main(String[] args) {
        // ForLoop(args);
        // WhileLoop(args);
        // Pattern2(args);
        // Pattern3(args);
        // Pattern4(args);
        // Pattern6(args);
        // Pattern5(args);
        // Pattern7(args);
        // Pattern8(args);
        // Pattern9(args);
        Pattern10(args);

    }

    public static void ForLoop(String[] args) {
        // Enter the Number of rows and columns4
        // ****
        // ****
        // ****
        // ****
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows and columns");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void WhileLoop(String[] args) {
        // Enter the Number of rows and columns4
        // ****
        // ****
        // ****
        // ****
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
        // (j=1) (j=2) (j=3)
        // (i=1) => 1 2 3
        // (i=2) => 1 2 3
        // (i=3) => 1 2 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Pattern");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= num) {
                System.out.print(j);
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static void Pattern4(String[] args) {
        // (j=1) (j=2) (j=3)
        // (i=1) => 1 2 3
        // (i=2) => 1 2 3
        // (i=3) => 1 2 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Pattern");
        int num = sc.nextInt();
        int i = num;
        while (i >= num) {
            int j = num;
            while (j >= num) {
                System.out.print(j);
                j--;
            }
            System.out.println("");
            i--;
        }
    }

    public static void Pattern6(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Pattern: ");
        int num = sc.nextInt(); // like in c++ int n; cin>>n;
        int i = 1;
        int count = 1;
        while (i <= num) {
            int j = 1;
            while (j <= num) {
                System.out.print(count + " ");
                count = count + 1;
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
        }
        // Output
        // Enter Number For Pattern: 5
        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 21 22 23 24 25
    }

    public static void Pattern5(String[] args) {
        // Enter Number For Pattern: 5
        // *
        // **
        // ***
        // ****
        // *****
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Pattern: ");
        int num = sc.nextInt(); // like in c++ int n; cin>>n;
        int i = 1;

        while (i <= num) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
        }
    }

    public static void Pattern7(String[] args) {
        // Enter Number For Pattern: 5
        // 1
        // 22
        // 333
        // 4444
        // 55555
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Pattern: ");
        int num = sc.nextInt(); // like in c++ int n; cin>>n;
        int i = 1;

        while (i <= num) {
            int count = i;
            int j = 1;
            while (j <= i) {
                System.out.print(count);

                j = j + 1;
            }
            System.out.println("");
            count = count + 1;
            i = i + 1;
        }
    }

    public static void Pattern8(String[] args) {
        // Enter Number For Pattern: 5
        // 1
        // 23
        // 456
        // 789
        // 10 11 12 13 14
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Pattern: ");
        int num = sc.nextInt(); // like in c++ int n; cin>>n;
        int i = 1;
        int count = 1; // chnage this also declare before 'i' loop body
        while (i <= num) {
            int j = 1;
            while (j <= i) {
                System.out.print(count);
                count = count + 1; // just chenge this line to get output increasing number similar to 7
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
        }
    }

    public static void Pattern9(String[] args) {
        // Enter Number For Pattern: 5
        // 1
        // 21
        // 321
        // 4321
        // 54321
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Pattern: ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            // -----------------------------
            // int count = i;
            // int j = 1;
            // while (j <= i) {
            // System.out.print(count);
            // if (count > 1) {
            // count = count - 1;
            // }
            // j = j + 1;
            // }
            // System.out.println("");
            // i = i + 1;
            // -----------------------------
            // We can also use this method (i-j+1) instead of 'count'
            int j = 1;
            while (j <= i) {
                System.out.print(i - j + 1);
                int check = i - j;
                System.out.print("{i=" + i + " j=" + j + "  i-j:  " + check + " }");
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
            // For Each Iteraion
            // Enter Number For Pattern: 5
            // 1{i=1 j=1 i-j: 0 }
            // 2{i=2 j=1 i-j: 1 }1{i=2 j=2 i-j: 0 }
            // 3{i=3 j=1 i-j: 2 }2{i=3 j=2 i-j: 1 }1{i=3 j=3 i-j: 0 }
            // 4{i=4 j=1 i-j: 3 }3{i=4 j=2 i-j: 2 }2{i=4 j=3 i-j: 1 }1{i=4 j=4 i-j: 0 }
            // 5{i=5 j=1 i-j: 4 }4{i=5 j=2 i-j: 3 }3{i=5 j=3 i-j: 2 }2{i=5 j=4 i-j: 1 }1{i=5
            // j=5 i-j: 0 }
        }
    }

    public static void Pattern10(String[] args) {
        // Enter Number For Pattern: 3
        // AAA
        // BBB
        // CCC
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Pattern: ");
        int num = sc.nextInt();
        int row = 1;
        // char ch = 'A';
        // while (i <= num) {
        // int j = 1;
        // while (j <= num) {
        // System.out.print(ch);
        // j = j + 1;
        // }
        // System.out.println("");
        // ch++;
        // i = i + 1;
        // }
        // We can do also use this method instead of this
        while (row <= num) {
            int j = 1;
            while (j <= num) {
                char ch = (char) ('A' + row - 1); // Calculate the character based on row number
                // In First Iteration :
                // 'A' + 1: row - 1 = A;
                // In Second Iteration :
                // 'A' + 2: row - 1= A+ 1 = B;
                // In Third Iteration :
                // 'A' + 3: row - 1= A+ 2 = C;
                System.out.print(ch);
                j = j + 1;
            }
            System.out.println("");
            // ch++;
            row = row + 1;
        }
    }
}
