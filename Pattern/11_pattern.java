package Pattern;

 class pattern11 {
    public static void main(String[] args) {
        int n=4;
    int col=1;
    for(int row=1;row<=n;row++){
    //    int space=n-row;
       for(int space=1;space<=n-row;space++){
         System.out.print(" ");
       }
       for(col=1;col<=2*row-1;col++){
        
        System.out.print("*");
       }
       System.out.println();

    }

    for(int row=n-1;row>=1;row--){
        // int space=n-row;
        for(int space=1;space<=n-row;space++){
          System.out.print(" ");
        }
        for(col=1;col<=2*row-1;col++){
         System.out.print("*");
        }
        System.out.println();
     }
   
        
    }
    
}
