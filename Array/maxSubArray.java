

public class maxSubArray {
    public static void main(String[] args) {
        int[] arr={2,5,6,7,4,3,9};
        int sum=0;
        //  ans=0,count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sum+=arr[i];
                // count++;
            }
            
        }
        System.out.println(sum);
        
    }
    
    
}
