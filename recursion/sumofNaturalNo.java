public class sumofNaturalNo {

    public static void natural(int i,int n,int sum){
        if(i>=n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        natural(i+1,n,sum);
          

    }
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int sum=0;
        natural(i,n,sum);

        
    }
    
}
