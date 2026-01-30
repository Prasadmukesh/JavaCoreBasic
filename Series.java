class Series {
    public void Fibbonscci(int n)
    {
        int a=0,b=1,c=0;
        for(int j=1;j<=n;j++)
        {
            c=a+b;
            System.err.print(c+" ");
            a=b;
            b=c;

        }
    }
    public void Dseries(int n)
    {
        int x=1,t=0;
        for(int j=1;j<=n;j++)
        {
            t=t*10+x;
            System.out.print(t+" ");
        }

    }
    //HCF AND LCM
    public void HCFLCM(int a, int b)
    {
        int x=a;
        int y=b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int hcf=a;
        System.out.println("HCF is "+hcf);
        int lcm= x*y/hcf;
        System.out.println("LCM is "+lcm);
    }
    public static void main(String[] args) {
        Series s= new Series();
       
        // s.Fibbonscci(15);
        // System.out.println();
        // s.Dseries(10);
        s.HCFLCM(125, 50);
    }
}
