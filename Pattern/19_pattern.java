package Pattern;

class pattern19 {
    public static void main(String[] args) {
        int n=4;
        int i=1;
                for(int row=1;row<=n;row++){
                    for(int space=1;space<=n-row;space++){
                        System.out.print(" ");
                    }
                    for(int col=1;col<=row;col++){
                        
                            System.out.print(i+ " ");
                            i+=2;                
                    }
                    System.out.println();
                }

            }

    }
    

