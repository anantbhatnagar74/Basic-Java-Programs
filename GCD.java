class GCD {
    public static void main(String[] args) {
        int c=1,a=100,b=88,g=0;
        while(c<=a && c<=b)
        {
            if(a%c==0 && b%c==0)
            {
                g=c;
            }
            c++;
        }
        System.out.println(g);
    }
}