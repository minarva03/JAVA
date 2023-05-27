class A{
    static int x=10;
    A(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        A c=new A(x);
    }
}