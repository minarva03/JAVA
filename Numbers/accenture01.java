package Numbers;

import java.util.Scanner;

public class accenture01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();

        System.out.print("enter the value of m:");
        int m=sc.nextInt();

        System.out.println("The difference is:" + diff(n,m));
    }

    public static int diff(int n,int m){
        int sum1=0;
        int sum2=0;
       for(int i=1;i<=m;i++){
          if(i%n==0){
            sum1+=i;
          }
          else
          sum2+=i;
       }
        return Math.abs(sum1-sum2);
    }

    
}
