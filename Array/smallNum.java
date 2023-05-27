

public class smallNum {
    public static void main(String[] args) {
        int[] arr={93,74,38,44,12};
        int small=arr[0];
     for (int i = 0; i < arr.length; i++) {
         if(arr[i]<small)
          small=arr[i];
     }
     System.out.println(small);
    }
    
}
