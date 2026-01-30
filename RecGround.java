import java.util.Scanner;

class RecGround {
   public static double length,width;

    static void Getdata()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Ground Length  :");
        length=sc.nextDouble();
        System.out.println("Enter Ground width  :");
        width=sc.nextDouble();
        sc.close();


 
    }

    static void GetArea()
    {
        System.out.println("Area of Rectangular Ground "+length*width);
    }

    static void GetaPerimeter()
    {
        System.out.println("Length of Boundary is "+(2*(length+width)));
    }

    static double Calculater()
    {
        return 3*2*(length+width)*20.0;
    }

    public static void main(String[] args) {
        Getdata();
        GetArea();
        GetaPerimeter();
        System.out.println("Amout of Fencing the Boundary Is Rs "+Calculater());

    }
    
}
