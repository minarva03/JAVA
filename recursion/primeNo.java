 class prime {
    public static boolean primeNo(int n,int i){
        if(n<=2)
         return (n==2)?true: false;   
          if(n%i==0)
           return false;
         else if (i>=n/2)
          return true;
         else
           return primeNo(n,i+1);
    }
    public static void main(String[]args){
        int n=12;
        if(primeNo(n,2))
        System.out.print("prime no ");
        else
        System.out.print(" not prime no ");
    }
    
}
