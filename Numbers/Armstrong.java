package Numbers;


public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int sum=0;
        int count=0;
        int rem=0;
        while(temp>0){
            temp=temp/10;
            count++;

        }
        temp=n;
        System.out.println(count);
        while(temp>0){
            rem=temp%10;
            sum+=Math.pow(rem,count);
            temp=temp/10;
        }
        

        if(sum==n){
            System.out.println(n+ " is an armstrong.");
        }
        else
        System.out.println(n+ " is not an armstrong.");
        // System.out.println(sum);
        // System.out.println(n);


    }
    
}
