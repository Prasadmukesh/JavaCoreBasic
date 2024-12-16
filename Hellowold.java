class Hellowold{
    public static void main(String [] args)
    {
        int n1=120,n2=220;
        double celcius=37.0;
        System.out.println("Hello India");
        double feh=(9*celcius)/5+32;
        System.out.println("Temperature in Fehrenheit "+feh);
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);
        int n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);
    }
}