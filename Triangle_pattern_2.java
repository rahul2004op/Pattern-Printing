package PatternPrinting;

import java.util.Scanner;

public class Triangle_pattern_2 {
    public static void main(String[] args) {

         Scanner sc =new Scanner(System.in);

        System.out.print("enter the format number of rows : ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        
        System.out.println("\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        
    }
    
}
