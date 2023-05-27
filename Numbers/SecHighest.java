package Numbers;
import java.util.Scanner;

public class SecHighest {

    public static void main(String[]args){
        int largest=0,secLargest=0;
        int rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check sec largest:");
        int n=sc.nextInt();
        while(n>0){
            rem=n%10;

        if(rem>largest){
           secLargest=largest;
           largest=rem;
           
        }
        else if (rem>=secLargest)
            secLargest=rem;
        n=n/10;
           

    }
    System.out.println(secLargest);
            
    }
    
}
