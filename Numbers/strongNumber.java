package Numbers;

public class strongNumber {
    public static void main(String[] args) {
        int n=135,rem,fact,temp=n,sum=0;
        while(n>0){
             fact=1;
            rem=n%10;

            for(int i=1;i<=rem;i++){
                  fact*=i;   
            }
            sum+=fact;
            n=n/10;
        }
        // System.out.println(sum);
         if(sum==temp)
           System.out.println(temp+ " is strong");
        else
          System.out.println(temp+ " not strong");

    }
    
}
