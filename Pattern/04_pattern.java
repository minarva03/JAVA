package Pattern;
import java.util.Scanner;
class pattern4 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of row:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<n+3;j++)
            System.out.print("*");
        System.out.println();
        
        }
    }
}
