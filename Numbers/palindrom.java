package Numbers;
import java.util.Scanner;

class palindrom{
    public static void main(String[]args){
        int rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check palindrom:");
        int n=sc.nextInt();
        int temp=n;
        while(n!=0){
            rem=n%10;
           rev=rem+rev*10;
            n=n/10;
        }
        if(temp==rev){
            System.out.println(temp+ " is a palindrom number");
        }
        else
        System.out.println(temp+ " is not a palindrom number");
        

        
    }
}