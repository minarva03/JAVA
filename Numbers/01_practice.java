// Write a program with a method named getTotal that accepts two integers as an
// argument and return its sum. Call this method from main( ) and print the
// results.

class A
{
    public static int getTotal(int a, int b)
    {
        return a+b;
    }
    public static void main(String[]args)
    {
        int result=getTotal(20,50);
        System.out.println(result);
    }
}
