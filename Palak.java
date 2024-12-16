class Palak
{
    public void msg()
    {
        System.out.println("Hello palak");
    } 
    public void Greet()
    {
        System.out.println("Good morning India");
    }

    public static void main(String[] args) {
        int num=11213;
        String city="New Delhi";
        
        Palak p1=new Palak();
        p1.Greet();
        p1.msg();
        System.out.println("value of num is "+num+" "+city);
    }
}