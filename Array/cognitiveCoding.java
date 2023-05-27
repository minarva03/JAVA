

import java.util.Scanner;

public class cognitiveCoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of r:");
        int r=sc.nextInt();
    
        System.out.print("enter the value of unit:");
        int unit=sc.nextInt();
       
        System.out.print("enter the value of n:");
        int n=sc.nextInt();

        System.out.print("enter the value of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
          System.out.print("arr count is-" +A(r,unit,n,arr));   
    }
    public static int A(int r, int unit, int n, int[]arr){
        if(arr==null)
        return -1;
       int req=r*unit;
       int sum=0;
       int count=0;
       for(int i=0;i<n;i++){
        sum+=arr[i];
        count++;
        if(sum>=req)
         break;
       }
          if (sum<req)
          return 0;
        return count;
       }       
    }


