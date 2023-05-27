

public class frequncyOfEle {
    public static void main(String[] args) {
        int[] arr={7,3,5,6,8,3,2,1,3,2,1,4,6};
        // boolean[] arr1={f,f,f,f,f,f,f,f,f,f,f};
        boolean[] arr1=new boolean[arr.length];

         for(int i=0;i<arr.length;i++){
            if(arr1[i]==true)
              continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                  arr1[j]=true;
                  count++;
                }
               
            }
            System.out.println("the frequency of " + arr[i] + "is " + count );
            

         }
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr1[i]==true){
        //         continue;
        //     }
        //     int count=1;
        //     for(int j=i+1;j<arr.length;j++){
        //        if(arr[i]==arr[j])
        //         count++;
        //         arr1[j]=true;   
        //     }
        //     System.out.println("the frequency of " + arr[i] + "is " + count );
        // }
        //     int count=1;
        // for (int i=0;i<arr.length;i++)
        // {
        //     if(i==arr.length-1)
        //     {
        //         System.out.println("the frequency of " + arr[i] + "is " + count );
        //     }
        //     else if(arr[i]==arr[i+1])
        //     {
        //         count++;
        //     }
        //     else{
        //         System.out.println("the frequency of " + arr[i] + "is " + count );
        //         count=1;
        //     }
        // }
       
    }
    
}
