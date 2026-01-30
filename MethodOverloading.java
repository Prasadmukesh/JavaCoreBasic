class MethodOverloading {
    int res=0;
    public void Add(int a)
    {
        res+=a;
        System.out.println("Sum is :"+res);

    }
    public void Add(int a,int b)
    {
        res=a+b;
        System.out.println("Sum is :"+res);


    }
    public void Add(int a,int b, int c)
    {
        res=a+b+c;
        System.out.println("Sum is :"+res);

    }
    public void Add(int a,int b, int c, int d)
    {
        res=a+b+c+d;
        System.out.println("Sum is :"+res);

    }
    public void Add(int ...a)
    {
        for (int i : a) {
            res+=i;
            
        }
        
        System.out.println("Sum is :"+res);

    }

    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.Add();
        mo.Add(55,77,34);
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
    

}*/