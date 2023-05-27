public class linearSearch {
    public static void print(int[]arr,int n){
        System.out.println("size of the array is "+ n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }

    public static boolean lineearSearch(int[]arr,int i,int size,int key){
        //  print(arr,size);
         if(size==0)
          return false;
        if (arr[i]==key)
          return true;
        else{
            boolean found=lineearSearch(arr, i+1, size-1, key);
          return found;
        }
       

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int i=0;
        int key=3;
        int size=arr.length;
        boolean ans=lineearSearch(arr,i,size,key);
        if(ans)
            System.out.println(key+" found");
        else
          System.out.println(key+" not found");
        
        
    }
    
}
