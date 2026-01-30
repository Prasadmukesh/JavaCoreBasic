import java.util.Scanner;

class Rectangle extends Shape {
    double length;
    double width;
    public void getparam()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Len of Reactangle :");
        length=sc.nextDouble();
        System.out.println("Enter width of Reactangle :");
        width=sc.nextDouble();
        sc.close();

    }
    public void GetArea()
    {
       System.out.println("Area of Rectangle "+(length*width)); 
    }
    public void Perimeter()
    {
        System.out.println("Perimeter of Rectangle "+2*(length+width)); 
    }
}
