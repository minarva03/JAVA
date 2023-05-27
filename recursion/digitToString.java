public class digitToString {

public static void toDigit(int n,String arr[]){
    if(n==0){
        return;
    }
    int rem=n%10;
            n/=10;
            toDigit(n,arr);
            System.out.print(arr[rem]+ " ");
            
}

    public static void main(String[] args) {
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n=435;
        toDigit(n, arr);
        
    }
    
}
