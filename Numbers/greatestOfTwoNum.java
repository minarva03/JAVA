package Numbers;
import java.util.Scanner;

public class greatestOfTwoNum {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
            System.out.print("enter the first number:");
            int num1=sc.nextInt();
            System.out.print("enter the sec number :");
            int num2=sc.nextInt();
            if(num1>num2)
            System.out.print(num1 +" is greater");
            else if (num1==num2){
            System.out.print("both are equal");
            }
            else
            System.out.print(num2 + " is greater");
    }
    
}
