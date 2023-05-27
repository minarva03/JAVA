public class PrintNthterm {
    public static void main(String[] args) {
        int num=12345;
        int term=4;
        System.out.println(printTerm(num,term));
    }
    public static int printTerm(int num,int term)
    {
        
        if(term==0)
        {
            return num%10;
        }
        else{
            
            num/=10;
            return printTerm(num, length(num)-term-1);
        }
    }
    public static int length(int num)
    {
        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;

        }
        return count;
    }
}
