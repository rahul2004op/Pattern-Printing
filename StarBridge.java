package PatternPrinting;
import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int r=sc.nextInt();
        int m=r-1;
        for(int i=1;i<=2*r-1;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        for(int i=1;i<=r;i++){

            for(int j=1;j<=m+1-i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
            }
            
            for(int j=1;j<=m+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
