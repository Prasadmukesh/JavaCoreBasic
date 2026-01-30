interface Adder {
    void Add();    
}
interface Subtractor {
    void Diff();   
}
interface Product {
void Multiple();
    
}
interface Division {
   void Div();
    
}


class Calculator implements Adder,Subtractor,Product,Division {

    int a=120;
    int b=25;
    public void Add()
    {
        System.out.println("Sum is "+(a+b));
    }
    public void Diff()
    {
        System.out.println("Diff is "+(a-b));
    }
    public void Multiple()
    {
        System.out.println("mul is "+(a*b));
    }
    public void Div()
    {
        System.out.println("div is "+(a/b));
    }

    public static void main(String[] args) {

        Calculator cal=new Calculator();
        cal.Add();
        cal.Diff();
        cal.Div();
        cal.Multiple();
        
    }
    
}
