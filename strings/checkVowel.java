public class checkVowel {
    public static void main(String[]args) {
        String s="i am minu";
        for(int i=0;i<=s.length()-1;i++){
        char c=s.charAt(i);
        
        if(c =='a' || c== 'e' || c=='i' || c=='o' || c=='u'){
            System.out.println(c + " is vowel");
        }
        else if(c ==' ')
          continue;
        else
        System.out.println(c + " is consonant");
    
    } 
    }
    
}
