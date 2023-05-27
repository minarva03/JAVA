package Array;

import java.util.Arrays;
import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter the array value:");
        Scanner sc=new Scanner(System.in);
        // int[][] arr=new int[3][3];
    //    int[][] arr={
    //         {1,2,3},
    //         {4,5,6},
    //         {7,8,9},
    //     };
          int[][] arr=new int[3][2];
        //   System.out.println(arr.length); //3
          for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                  arr[row][col]=sc.nextInt();
            }  
          }
          for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
               System.out.println((arr[row][col]) + " ");
            }  
          }
        
        
         

    }
    
}
