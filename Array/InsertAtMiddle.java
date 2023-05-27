

import java.util.Arrays;

public class InsertAtMiddle {
    public static int[] insertKey(int n,int pos,int key,int[]arr){
        int[] newArr=new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i<pos-1){
                newArr[i]=arr[i];
            }
            else if(i==pos-1){
                newArr[i]=key;
            }
            else
            newArr[i]=arr[i-1];
        }
    return newArr;
  }

  public static void main(String[]args){
    int n=5;
    int pos=3;
    int key=3;
    int[]arr={1,2,4,5,6};
    System.out.println("array before adding" + key + Arrays.toString(arr));
    arr=insertKey(n,pos,key,arr);
    System.out.println("array after adding" + key + Arrays.toString(arr));

  }
}
