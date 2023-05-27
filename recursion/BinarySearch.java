public class BinarySearch {

    public static void print(int[]arr,int start,int end){
        // for(int i=start;i<=end;i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.println();

    }
    public static boolean binarySearch(int[]arr,int start,int end,int key){
        // print(arr,start,end);
        int mid=start+(end-start)/2;
        // System.out.println("value of mid array is:"+ arr[mid]);
        if(start>end)
         return false;
         if(arr[mid]==key)
         return true;
         if(arr[mid]>key){   
             return binarySearch(arr, start, mid-1, key);
         }
         else
           return binarySearch(arr, mid+1, end, key);

          
    }
    public static void main(String[] args) {
        int[] arr={2,4,7,9,12,56};
        int key=56;
        int start=0;
        int end=arr.length-1;
        boolean ans=binarySearch(arr,start,end,key);
        if(ans){
            System.out.println("present");
        }
        else
         System.out.println("not present");
    }
    
}
