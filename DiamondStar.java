package PatternPrinting;
import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int r=sc.nextInt();

        int nsp=r-1; //number of spaces 
        int nst=1;   //number of stars
        for(int i=1;i<=r;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");  //spaces
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");  //stars
            }

            nsp=nsp-1;
            nst=nst+2; 
            System.out.println();
        }


        nsp=1; //number of spaces 
        nst=nst-4;   //number of stars
        for(int i=1;i<=r;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");  //spaces
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");  //stars
            }

            nsp=nsp+1;
            nst=nst-2; 
            System.out.println();
        }
    }
}
