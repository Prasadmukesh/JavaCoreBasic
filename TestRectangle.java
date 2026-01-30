class TestRectangle {
    public static void main(String[] args)
    {
        Shape s= new Shape();
        s.GetArea();
        // s=new Rectangle();
        // s.getparam();
        // s.GetArea();
        // s.Perimeter();
        s=new Circledemo();  // upcasting
        s.getparam();
        s.GetArea();
        s.Perimeter();

        // Rectangle r1=(Rectangle)s;  //downcasting
        // r1.GetArea();

        System.out.println(s instanceof Rectangle);
        System.out.println(s instanceof Circledemo);
        System.out.println(s instanceof Shape);

        int k=19;   //value type
        System.out.println(+k);
        Integer a=k;  //object
        System.out.println(+a);
          
        System.out.println(a + " is of type " + ((Object)a).getClass().getSimpleName());  
        




        
    }

    
}
