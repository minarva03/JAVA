public class stringReverse {
    public static void stringRev(int i,int j,char str[]){
        if(i>=j)
         return;
         char temp=str[i];
         str[i]=str[j];
         str[j]=temp;
          stringRev(i+1, j-1, str);
         }     
    public static void main(String[] args) {
        String s="minarva";
        char[] str=s.toCharArray();
        int i=0;
        int j=str.length-1;
        stringRev(i,j,str);
        String ans=new String(str);
        System.out.println(ans);
    }
}
