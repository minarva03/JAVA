package Array;

 class swap {
    public static void main(String[]args){
        int[] arr={1,2,3,4};
        for (int i=0;i<arr.length;i+=2){
                int temp; 

                 arr[i]=arr[i]+arr[i+1];
                 arr[i+1]=arr[i]-arr[i+1];
                 arr[i]=arr[i]-arr[i+1];

            //    temp=arr[i];
            //    arr[i]=arr[i+1];
            //    arr[i+1]=temp;
        }
               for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
               }
             
        
        
    }
  

}
