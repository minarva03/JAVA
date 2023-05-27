public class reverseWord {
    
    public static void main(String[]args){
        String s="my name is minarva";
        int start=0;
        int end =0;
        String s1=" ";
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                end=i;
                for(int j=end-1;j>=start;j--){
                    s1=s1+s.charAt(j);

                }
                start=end+1;
                s1=s1+" ";
            }
         }
         for(int i=s.length()-1;i>=end;i--){
            s1=s1+s.charAt(i);

         }
         System.out.println(s);
         System.out.print(s1);
    }
}
