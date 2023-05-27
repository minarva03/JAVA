public class sumOfArrayElmt {

    public static void print(int[]arr,int n){
        System.out.println("size of the array is "+ n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static int sum(int[]arr,int i,int size){
        print(arr,size);
         if(size==0)
          return 0;
        if (size==1)
           return arr[i];
       
        int s=arr[i]+sum(arr,i+1,size-1);
        return s;
       
      

    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int sum=0;
        int i=0;
        int size=arr.length;
        int sumOfArrayElmt=sum(arr,i,size);
        System.out.println(sumOfArrayElmt);
    }
}
