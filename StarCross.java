package PatternPrinting;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i-j)%2==0){
                    System.out.print("x"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }



        System.out.print("\n\n");
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || (i+j==n+1)){
                    System.out.print("x"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    
}
