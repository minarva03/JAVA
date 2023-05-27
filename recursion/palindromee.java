public class palindromee {
    public static boolean palindrome(int i,int j,char[]str){
        if(i>j)
         return false;
        if(str[i]!=str[j])
         return false;
        else{
        char temp=str[i];
         str[i]=str[j];
         str[j]=temp;
         return palindrome(i+1, j-1, str);
    }

        

    }
    public static void main(String[] args) {
        String s="aaaaa";
        char[] str=s.toCharArray();
        int i=0;
        int j=str.length-1;
        boolean ans=palindrome(i,j,str);
        if(ans)
         System.out.println("palindrom");
        else
         System.out.println("Not palindrom");
    }
    
}
