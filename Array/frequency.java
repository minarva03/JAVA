class frequency{
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,5};
        int count=0;
        for(int i=0;i<=arr.length;i++){
            for(int j=1;j<=arr.length;j++){
               if(arr[i]==arr[j]){
                count++;
               }
            }
            System.out.println("the frequency of " + arr[i] + "is " + count );
        }
       
    }
}