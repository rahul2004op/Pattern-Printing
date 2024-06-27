package PatternPrinting;
import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int r=sc.nextInt();
        int m=r-1;
        
        for(int i=1;i<=2*r-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        
        r--;
        int nsp=1;  //number of spaces 

        for(int i=1;i<=r;i++){
            int a=1;
            for(int j=1;j<=r+1-i;j++){
                System.out.print(a +" ");// number
                a++;
            }
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");// Spaces
                a++;
            }
            nsp=nsp+2;
            for(int j=5;j<=r+5-i;j++){
                System.out.print(a + " "); // number
                a++;
            }
            System.out.println();
        }
    }
}
