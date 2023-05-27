package Pattern;

 class pattern20 {
    public static void main(String[] args) {
        int n=6;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
