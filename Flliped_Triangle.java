package PatternPrinting;

import java.util.Scanner;

public class Flliped_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if((i+j)==r+1 || (i+j)> r){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if((i+j)==r+1 || (i+j)> r){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n2nd method\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print("#" + " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" " + " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" " + " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        
        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" " + " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
