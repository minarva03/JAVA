package Pattern;
import java.util.Scanner;

 class pattern3 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of row:");
        int n1=sc.nextInt();
        System.out.print("enter the no of col:");
        int n2=sc.nextInt();
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if ((i==1 || i==n1) || (j==1 || j==n2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
           
        
        }

    
        
    }
}