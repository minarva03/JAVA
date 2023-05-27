public class hackerrank {
    public static void main(String[] args) {
        String s="welcometojava";
        String B="";
        int i,k=3; 
         String A[]=new String[(20)];
          for( i=0;i<(s.length()-k);i++)
          {
             B =s.substring(i,k+i); 
            A[i]=B; 
            A[i]=s.substring(s.length()-k); 
            System.out.println(A[i]);
    }
    
    }
    
}
