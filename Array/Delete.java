

import java.util.Arrays;

public class Delete {
    public static int[] deleteElement(int n,int key,int pos,int[] arr){
       int[]newArr=new int[n-1];
       for(int i=0;i<n;i++){
        if(i<pos-1)
          newArr[i]=arr[i];
        else if(arr[i]==key)
          break;
        else
        newArr[i]=arr[i+1];
       }
        return newArr;
    }

  public static void main(String[]args){
    int n=5;
    int pos=3;
    int key=3;
    int[]arr={1,2,3,4,5};
    System.out.println("array before deleting " + key + Arrays.toString(arr));
    arr=deleteElement(n,pos,key,arr);
    System.out.println("array after deleting " + key + Arrays.toString(arr));

  }
    
}
