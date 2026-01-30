import java.util.Scanner;

public class Employee {
    //instance variable
    int empid;
    String empname;
    String post;
    double basic;
    char gender;
    Scanner sc =new Scanner(System.in);
    public void Getemployee()   //method
    {
        System.out.println("Enter Employee Details :");
        System.out.println("Entr Emp Id :");
        empid=sc.nextInt();
        System.out.println("Entr Emp name :");
        empname=sc.nextLine();
        System.out.println("Entr Emp post :");
        post=sc.nextLine();
        System.out.println("Entr Emp basic :");
        basic=sc.nextDouble();
        System.out.println("Entr Emp gender :");
        gender=sc.next().charAt(0);

           }
    public void Display()  //method
    {
        System.out.println("Employee Details:");
        System.out.println(empid+" "+empname+" "+post+ " "+basic +" "+gender);
    }
    void Edit()
    {
        System.out.println("Enter new amount ");
        double amt=sc.nextDouble();
        basic=basic+amt;
        sc.close();

    }

    
}


