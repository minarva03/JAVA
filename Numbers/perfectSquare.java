package Numbers;
import java.util.Scanner;

public class perfectSquare {

   static boolean isPerfectSquare(int num){
        if(num>=0){
            int sr=(int)Math.sqrt(num);
            return((sr*sr)==num);

        }
        return true;

    }

        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the number to check perfect square:");
            int num=sc.nextInt();
            if(isPerfectSquare(num))
              System.out.println(num + " is a perfect square");
            else
            System.out.println(num + " is not a perfect square");
            }

        }
    

