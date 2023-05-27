

public class ToUpperCase {
    public static void main(String[] args){
        String s="minu";
        String s1=" "; 
        for (int i=0;i<s.length();i++){
            int x=s.charAt(i)-32;
            s1=s1+(char)x;
        }
        System.out.println(s1);

    }
    
}
