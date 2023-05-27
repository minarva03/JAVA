import java.util.*; 
import java.io.*;

class Main {

  public static String SimpleSymbols(String str) {
        char curCh;
        for (int i = 0; i < str.length(); i++) {
            curCh = str.charAt(i);
            if (Character.isLetter(curCh)) {
               if (i == 0 || i == (str.length() - 1))
                   return "false";
               else if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+')
                   return "false";
            }
        }
        return "true";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
  }

}