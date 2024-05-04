class Fibonacci
{
    public static void main(String[] args) 
    {
        int a=0,b=1,n=10,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}

Output : 0 1 1 2 3 5 8 13 21 34 55 89 
