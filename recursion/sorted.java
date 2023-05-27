public class sorted {
    public static boolean sorted(int[] arr,int index,int size){
        if(size==0 || size==1)
         return true;
        if(arr[index]>arr[index+1])
         return false;
        else{
            boolean rem=sorted(arr,index+1,size-1);
            return rem;
        }
    }





    public static void main(String[] args) {
        int[] arr={2,5,8,9};
        int size=arr.length;
        int index=0;
        boolean ans=sorted(arr,index,size);
        if(ans){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
    
}
