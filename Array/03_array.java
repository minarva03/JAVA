package Array;

 class array {
    public static void main(String[] args) {
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num=783;
        while(num>0){
            int rem=num%10;
            num/=10;
            int i;
        for( i=0;i<arr.length;i++){
            if(rem==i){
                System.out.print(arr[i]+ " ");
               
            }
            
        }
        
    }
        
    }
    
    
}
