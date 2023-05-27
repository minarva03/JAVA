

public class LargestNum {
    public static void main(String[] args) {
        int[] arr={5,7,8,10,55,87};
        int large=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]>large)
        large=arr[i];
    }    
    System.out.println(large);
    }
    
}
