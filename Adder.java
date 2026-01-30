public class Adder {
    public void Add(double ...n)
    {
        double s=0.0;
        for (double d : n) {
            s+=d;
        }
        System.out.println("Sum of given Data "+s);

    }
}
