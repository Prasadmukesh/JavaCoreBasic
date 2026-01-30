public class Multiplyer {
    public void Mul(double ...num)
    {
        double m=1.0;
        for (double d : num) {
            m*=d;
        }
        System.out.println("Product of Numbers "+m);
    }

    public static void main(String[] args) {
        Multiplyer m1= new Multiplyer();
        m1.Mul(11,10);
        m1.Mul();
    }
}
