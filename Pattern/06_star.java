package Pattern;

 class star {
    public static void main(String[] args) {
        int r=9;
        if(r%2!=0){
        for(int row=1;row<=r;row++){
            if(row<=r/2+1){
                for(int col=1;col<=row;col++){
                    System.out.print("*");
                }
            }
            else{
                for(int col=1;col<r-row+1;col++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    else
       System.out.println("enter valid row no to get the right output");
    }
    
}
