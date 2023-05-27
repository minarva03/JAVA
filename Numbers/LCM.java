package Numbers;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        int i;
        int max=(num1>num2?num1:num2);//ternary operator
        for (i=max;i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0)
              break;
        }
        System.out.println(i+"is the LCM of"+num1+" and "+num2);

    }
    
}
