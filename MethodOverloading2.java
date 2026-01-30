class MethodOverloading2 {
    
    public int Add(int a, int b)
    {
        int res=0;
        res+=a;
       // System.out.println("Sum is :"+res);
       return res;

    }
    public float Add(float a,float b,int c)
    {
        int res;
        res=(int)(a+b+c);
        //System.out.println("Sum is :"+res);
        return res;


    }
    public double Add(double a,double b)
    {
        double res;
        res=a+b;
        System.out.println("Sum is :"+res);
        return res;

    }
    public String Add(String a, String b)
    {
        String res=a+" "+ b;
        //System.out.println("Sum is :"+res);
        return res;

    }
    

    public static void main(String[] args) {
        MethodOverloading2 mo=new MethodOverloading2();
    
       System.out.println( mo.Add(55,77,33));
       System.out.println(mo.Add("New", "York"));
       System.out.println(mo.Add(333.99,100.77));
    }
}


// Assignment 1
/* class Shape
{
    void Area() // circle
    void Area()  //rectangle
    void Area()   //square
    void Area()     // triangle
    void Area()  Parallelogram
    void Area()  Cuboid
    

}
    */