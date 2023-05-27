package Array.strings;

public class CharToAscii {
   
    public static void main(String[]args) {
        String s="minu";
        for(int i=0; i<=s.length();i++){
            int asci=s.charAt(i);
            System.out.println( "Ascii value of " + s.charAt(i) + " is " +asci);

        }
    }
}
