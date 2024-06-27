package PatternPrinting;

import java.util.*;


public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int r=sc.nextInt();
        
        for(int i=1;i<=2*r-1;i++){  //rows
            for(int j=1;j<=2*r-1;j++){  //cloumns

                int a=i;
                int b=j;
                if(i>r){
                    a=2*r-i;
                }
                if(j>r){
                    b=2*r-j;
                }
                System.out.print(Math.min(a, b) + " ");
                
            }
            System.out.println();
        }

        System.out.println("\n 2nd Pattern \n");
        for(int i=1;i<=2*r-1;i++){  //rows
            for(int j=1;j<=2*r-1;j++){  //cloumns

                int a=i;
                int b=j;
                if(i>r){
                    a=2*r-i;
                }
                if(j>r){
                    b=2*r-j;
                }
                System.out.print(r+1-Math.min(a, b) + " ");
                
            }
            System.out.println();
        }
    }
}
