package PatternPrinting;

import java.util.Scanner;

class StarPlusPattern_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int r = sc.nextInt();
        int mid = r / 2 + 1;
        for (int i = 1; i <= r; i++) {   //rows
            for (int j = 1; j <= r; j++) {   //cloumn
                if (i == mid || j == mid) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 2 || j == 2) {
                    System.out.print("*"+" ");
                } else {
                    System.out.print("0"+ " ");
                }
            }
            System.out.println();
        }
        
    }


}
