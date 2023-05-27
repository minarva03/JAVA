package Numbers;

import java.util.Scanner;

public class greatestAmongThree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
                System.out.print("enter the first number:");
                int num1=sc.nextInt();
                System.out.print("enter the sec number :");
                int num2=sc.nextInt();
                System.out.print("enter the sec number :");
                int num3=sc.nextInt();
                // if(num1>num2){
                //     if(num1>num3)
                //     System.out.print(num1 +" is greatest");
                //     else
                //     System.out.print(num3 +" is greatest");
                // }
                // else if (num2>num3){
                //     System.out.print(num2 +" is greatest");
                // }
                // else
                // System.out.print(num3 +" is greatest");

                if(num1>num2 & num1>num3)
                System.out.print(num1 +" is greatest");
                else if(num2>num1 & num2>num3)
                System.out.print(num2+" is greatest");
                else if(num3>num1 & num3>num2)
                System.out.print(num3 +" is greatest");
                else
                System.out.print("Please enter valid numbers");
                 
    
}
}