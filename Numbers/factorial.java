package Numbers;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       int fact=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter to no to find factorial of nth term:");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print("The factorial of "+n + "is " + fact);

        
    }
    
}
