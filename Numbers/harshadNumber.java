package Numbers;

public class harshadNumber {
    public static void main(String[] args) {
        int n=353,sum=0,rem,temp=n;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        if(temp%sum==0)
         System.out.println("Harshad number");
         else
         System.out.println("not Harshad number");
    }
    
}
