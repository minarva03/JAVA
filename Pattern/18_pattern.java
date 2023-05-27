package Pattern;
 class pattern18 {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            for(int col=1;col<n;col++){
                int i=3;
                
                if(col==1 || col==n-1 || row==n || row==1)
                    System.out.print(i);
                    
                else{
                    int j=i-1;
                    System.out.print(j--);
                }
                
            }
            System.out.println();
        }
    }
    
}
