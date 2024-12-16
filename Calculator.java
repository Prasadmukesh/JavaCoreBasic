public class Calculator {
    float n1;
    float n2;
    public void Add()
    {
        System.out.println("Sum is "+(n1+n2));
    }
    public void max()
    {
        float m=(n1>n2)?n1:n2;
        System.out.println("Highest value is "+m);
    }
    public void Getdata(float a, float b)
    {
        n1=a;
        n2=b;

    }
}
