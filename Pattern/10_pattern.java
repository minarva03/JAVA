package Pattern;
 class Diamond {
    public static void main(String[] args) {
        int n=4;
    int col=1;
    for(int row=1;row<=n;row++){
       int space=n-row;
       for(space=1;space<=n-row;space++){
         System.out.print(" ");
       }
       for(col=1;col<=row;col++){
        // System.out.print("*");
        System.out.print("* ");
       }
       System.out.println();
    }
   
        
    }
    
}
