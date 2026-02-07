class swap2
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=40;
        int temp=c;
        c=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(temp);
    }
}