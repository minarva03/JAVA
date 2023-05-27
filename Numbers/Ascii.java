package Numbers;
import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        // int n=10;
        // System.out.println(n<<2);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char to find ascii valuez:");
        char c=sc.nextLine().charAt(0);
        int i=c;
        System.out.println("Ascii value of "+c+ "is " +i);
        
    }
    
}
