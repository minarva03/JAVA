package Numbers;
import java.util.Scanner;

public class leapYear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
                System.out.print("enter the first number:");
                int year=sc.nextInt();
                if(year%100!=0 && year%4==0){
                    System.out.print("This is a leap year");
                }
                else if(year%4==0)
                System.out.print("This is a leap year");
                else
                System.out.print("This is not a leap year");
    }
    
}
