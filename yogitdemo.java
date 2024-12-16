public class yogitdemo {
    int a=1990;
    int b=1190;
    public void Add()
    {
        int s=a+b;
        System.out.println("sum is "+s);
    }
     public void Diff()
    {
        int s=a-b;
        System.out.println("Diif is "+s);
    }
     public void Mul()
    {
        int s=a*b;
        System.out.println("Multiply is "+s);
    }
     public void Div()
    {
        int s=a/b;
        System.out.println("Division is "+s);
    }
    public static void main(String[] args) {
        System.out.println("Hello Mr. Yogit ");
        yogitdemo obj=new yogitdemo();
        obj.Add();
        obj.Mul();
    }
}
