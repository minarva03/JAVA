
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of array element:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("the array elements are:");
        for (int i=0;i<n;i++){
           System.out.println(arr[i]);
       }
    }
}
