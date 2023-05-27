import javax.sql.rowset.spi.SyncResolver;

public class frequescy {
    public static void main(String[] args) {

        String s="minarva";
        int[] freq=new int[s.length()];
        char Str[]=s.toCharArray();//convert string to array of char

        for(int i=0;i<s.length();i++){
             freq[i]=1;
             for(int j=i+1;j<s.length();j++){
                if(Str[i]==Str[j]){
                    freq[i]++;
                    Str[j]=' ';
                }
                 
             }    
        }
        for(int j=0;j<freq.length;j++){
            if(Str[j] != ' ') 
                System.out.println(Str[j] +"="+ freq[j]);
           
        }
    }
    
}
