class toggle{
    public static void main(String[]args) {
        String s="i Am mInU";
        String s1="";
        for(int i=0;i<=s.length()-1;i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
               s1=s1+Character.toLowerCase(c);
            else
            s1=s1+Character.toUpperCase(c);

        }
        System.out.println(s1);
      
}
}