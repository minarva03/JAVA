class pow{
    public static int powOf(int base, int n){
        if(n==0)
        return 1;
        return(base*powOf(base,n-1));

        //OR

        // int result=1;
        // while(n>0){
        //     result=result*base;
        //     n--;
        // }
        // return result;
    }
    public static void main(String[]args){
        int base=7;
        int n=4;
        powOf(base,n);
        System.out.println("the "+n+"th power of "+ base + "is " + powOf(base,n));
        
        
    }

}



