package Numbers;
import java.util.Scanner;

public class prettyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no to list pretty numbers:");
        int n=sc.nextInt();
        System.out.println("The Pretty numbers till "+n+ " are");
        for(int i=1;i<=n;i++){
            int rem=i%10;
            if(rem==2 || rem==3 || rem==9){
                System.out.println(i);
            }
        }
        
    }
    
}
