// public class linearSearch {
//     public static void main(String[]args){
//         int[]arr={28,5,22,57,2,8};
//         int key=57;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key)
//             System.out.println(key+ " is found in "+i+ "th index");
//         }
//     }

    
// }


public class linearSearch {

    public static int isLinear(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return i;
    }
    return -1;
}

    public static void main(String[]args){
        int[]arr={28,5,22,57,2,8};
        int key=57;
            System.out.println(key+ " is found in "+isLinear(arr,key)+ "th index");
        }
    }

    

