package PatternPrinting;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows :");

        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("\n2nd method\n\n");
        int nsp=r-1; //number of spaces
        int nst=1; //number of stars
        for(int i=1;i<=r;i++){ //number of rows
            for(int j=1;j<=nsp;j++){  //print for spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){   //print for stars
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp=nsp-1;
            nst=nst+2;
        }

    }
}
