package PatternPrinting;
import java.util.Scanner;

public class TrianglePattren {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int r=sc.nextInt();
        

        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)((j+64))+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

            for(int k=1;k<=i;k++){
                System.out.print((char)((k+64))+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print((char)((j+64))+" ");
                }
                else{
                System.out.print(j+" ");
                }
        }
        System.out.println();

    }    
}
}
