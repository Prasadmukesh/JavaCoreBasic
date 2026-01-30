import java.util.Scanner;
class Circledemo extends Shape {
    double radius;
    public void getparam()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius :");
        radius=sc.nextDouble();
        sc.close();
        // add your code
    }
   public void GetArea()
   
   {
    System.out.println(" Area of Area "+Math.PI*radius*radius);
   } 

   public void Perimeter()
   {
    System.out.println("Circumference of Circle "+(2*Math.PI*radius));
   }
    
}
