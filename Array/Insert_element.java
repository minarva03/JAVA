
import java.util.Scanner;
import java.util.Arrays;

public class Insert_element {
   public static void main(String[]args) {
    int[] arr={1,2,3,4,5,6};
    int n=arr.length;
    System.out.println("The element before insertion:");
    
        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element you want to insert:");
        int x=sc.nextInt();


        int[] newArr=new int[n+1];
        for (int i = 0; i < n; i++){
        newArr[i] = arr[i];
        }
            newArr[n] = x;

    System.out.println("The element after insertion:");
        System.out.println(Arrays.toString(newArr));
    }
   }

