package Numbers;

public class neonNumber {
    public static void main(String[] args) {
        int n=81,rem=0,sum=0,temp=n,count=0;
        int po=0;
        while(n>0){
            rem=n%10;
            count++;
            n=n/10;    
        }
        System.out.println(count);
        System.out.println(temp);
        n=temp;
        while(n>0){
            rem=n%10;
            // po=Math.pow(rem,count);
            sum+=rem;
            n=n/10;
        }
        po=(int) Math.pow(sum,count);
        System.out.println(po);
       
        if(temp==po)
         System.out.println("neon no");
        else
        System.out.println("not neon no");
        
    }
    
}
