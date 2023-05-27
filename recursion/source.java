public class source {
    public static void path(int src,int dest){

    System.out.println("src:"+ src);  
    if(src==dest){
        System.out.println("reached");
        return;
    } 
      src++;
    path(src,dest);
    }

    public static void main(String[] args) {
        int src=1;
        int dest=10;
        path(src,dest);
    }
    
}
