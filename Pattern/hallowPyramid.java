package Pattern;

public class hallowPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                if(col==1 || col==2*row-1 || row==n)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
