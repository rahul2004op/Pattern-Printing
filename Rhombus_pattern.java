package PatternPrinting;
import java.util.Scanner;
public class Rhombus_pattern {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=65;

        System.out.print("enter the number of rows :");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){

            for(int j=1;j<=r-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("2nd example");
        System.out.println("\n\n");

        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=r-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("3rd example");
        System.out.println("\n\n");

        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=r-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

        
        System.out.println("4th example");
        System.out.println("\n\n");

        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=r-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print((char)(a)+" ");
                a=a+1;
            }
            System.out.println();
        }


    


    }   
}
