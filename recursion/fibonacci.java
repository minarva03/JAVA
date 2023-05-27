public class fibonacci {
    public static void fibo(int a, int b, int n){
        if(n==0)
         return;
         int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);


    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-2);
    }
    
}

//---------------------------------------
//nth NUMBER TERM

// import javax.sql.rowset.spi.SyncResolver;

// class fibonacci{
//     //0,1,1,2,3,5,8,13,21,34......
//     public static int fibo(int n){
//         if(n==0)
//          return 0;
//         if (n==1)
//          return 1;
//         int s= fibo(n-1)+fibo(n-2);
//         return s;
//     }
//     public static void main(String[] args) {
//         int n=5;// recursion till 5th term
//        int res=fibo(n);
//        System.out.println("the "+ n+"th term of fibo is "+ res);
        
        



//     }
// }