package Array;

public class arrayCreation {
    public static void main(String []args) {
        int[] arr={1,3,5,4,7};
       int sum=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]<arr[i+1]){
                sum=sum+arr[i];
                
               
                
             }
             
        }
        System.out.println(sum);
        
     
        }
       
    }

