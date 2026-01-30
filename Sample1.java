import java.util.Scanner;

class Sample1 {
    void Hello(String name)
    {
        
        System.out.println("Hello "+name);
    }

    static void Userinput()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a Number : ");
        x=sc.nextInt();
        System.out.println("X "+x);

        System.out.println("Enter a decimal number :");
        double d=sc.nextDouble();

        System.out.println("Value of d "+d);

        System.out.println("Enter your Name :");
        String myname=sc.next();

        System.out.println("Enter Your Gender :");
        char gender=sc.next().charAt(0);

        System.out.println("My name is "+myname);

        System.out.println("Gender is "+gender);

        sc.close();
    }
    public static void main(String[] args) {
        System.out.println("Hello Java");

        int a=100;
        double b=99.99;
        char ch='M';
        String city="New Delhi";
        boolean b1=true;

        System.out.println("value of a "+a);
        System.out.println("value of b "+b);
        System.out.println("value of ch "+ch);
        System.out.println("value of b1 "+b1);
        System.out.println("City is "+city);

        Userinput();
        Sample1 s1=new Sample1();
        s1.Hello("Samarth"+"Good Evening");


    }
}
