class Demo{
    private int a=100;
    protected String b="New Delhi";
    int p=89;
    public int k=900;
    private void msg()
    {
        System.out.println("Hello Java");
    }

class AccessModifier {
   
    public static void main(String[] args)
    {
        Demo a1=new Demo();
        System.out.println(a1.k);
        System.out.println(a1.b);
        System.out.println(a1.p);
        System.out.println(a1.a);
        a1.msg();
        
        
        
    }
   
}
}



