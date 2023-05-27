import java.util.Scanner;

public class compareTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("enter the first String:");
            String s1=sc.nextLine();
            System.out.print("enter the second String:");
            String s2=sc.nextLine();

            if(s1.compareTo(s2)>0)
            System.out.print("s1 is greater");
            else if(s1.compareTo(s2)<0)
            System.out.print("s2 is greater");
            else
            System.out.print("both are equal");

              
                
        
    }
    
}
