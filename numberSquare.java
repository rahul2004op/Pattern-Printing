package PatternPrinting;
import java.util.Scanner;

public class numberSquare {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of rows :");
    int n=sc.nextInt();
    System.out.print("enter the number of columns :");
    int m=sc.nextInt();
    for (int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println("\n\n");
    for (int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    System.out.println("\n\n");
    for (int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            System.out.print((i+65)+" ");
        }
        System.out.println();
    }


}
}
