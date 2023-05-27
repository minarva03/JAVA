package Numbers;
import java.util.Scanner;
import java.math.BigInteger;

public class addTwoLargeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no:");
        String n1=sc.nextLine();
        System.out.println("enter first no:");
        String n2=sc.nextLine();

        BigInteger num1=new BigInteger(n1);
        BigInteger num2=new BigInteger(n2);
        BigInteger sum=num1.add(num2);
        BigInteger mul=num1.multiply(num2);
        System.out.println("sum is "+sum);
        System.out.println("multiplication is "+mul);
    
        
    }
   

    
}
