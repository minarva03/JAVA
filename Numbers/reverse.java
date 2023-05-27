package Numbers;

public class reverse {
    public static void main(String[] args) {
        int rem=0,rev=0;
        int n=456;
        int temp=n;
        while(n>0){
            rem=n%10;
            rev=rem+rev*10;
            n=n/10;
        }
        System.out.println("reverse is "+ rev);
    }
    
}
