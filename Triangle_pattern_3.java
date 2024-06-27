package PatternPrinting;
import java.util.Scanner;

public class Triangle_pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of rows: ");
        int r= sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print((2*j-1)+" ");
                
            }
            System.out.println();
        }

        System.out.print("\nsecond method\n");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=2*i-1;j=j+2){
                
                System.out.print(j+" ");
                
            }
            System.out.println();
        }

        System.out.print("\nThird method\n");
        for(int i=1;i<=r;i++){
            int a=1;
            for(int j=1;j<=i;j++){
                
                System.out.print(a+" ");
                a=a+2;
                
            }
            System.out.println();
        }

    }
    
}
