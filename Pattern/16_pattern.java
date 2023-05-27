package Pattern;

class pattern16 {
    public static void main(String[] args) {
        int n=5;
        for(int row=n;row>=1;row--){
            int space=n-row;
            for(int i=1;i<=space;i++){
                System.out.print(" ");
            }    
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
