class Neon
{
    public static void main(String args[])
    {
        int n=9,s=0,r;
        int square = n*n;
        while(square>0)
        {
            r=square%10;
            s=s+r;
            square=square/10;
        }
        if(s==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a neon number");
        }
    }
}

Output : Neon Number
