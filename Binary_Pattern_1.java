package PatternPrinting;

import java.util.Scanner;

public class Binary_Pattern_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of rows :");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || (i - j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                }
            }
            System.out.println();
        }

        
        System.out.println("\n");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

    }

}
