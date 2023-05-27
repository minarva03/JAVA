// import java.util.Scanner;

public class palindrom {

    public static void main(String[] args){
        // String s=new String();
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the string");
        String s=new String("hih");
        String s1="";

        for(int i=s.length()-1;i>=0;i--)
              s1+=s.charAt(i);
        
        if(s.equals(s1))
            System.out.println(s +" is palindrom");
          
        else
          System.out.println(s +" is not palindrom");


      
    }
    
}
