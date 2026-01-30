import java.util.Random;
import java.util.Scanner;

public class BankSys {
    // instance variable data member
    String accno;
    String name;
    String address;
    String phone;
    double balance;
    // String PAN;
    // String Aadhaarno;
    static String branch="Silkboard";
    static String IFSC ="SBI0001017";
    static double ROI=7.5;
    
    public BankSys()  //default constructor
    {
        accno=generate_accno(10);
        name="sam";
        address="delhi";
        phone="45345566";
        balance=0.00;
    }
        //parameterized constructor
    public BankSys(String name,String address,String phone,double balance)
    {
        //this.accno=accno;
        accno=generate_accno(10);
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.balance=balance;

    }
    // OpenAccount()
    void OpenAccount()
    {
        
        Scanner read= new Scanner(System.in);
        System.out.println("Enter Account Holder Details :");
        System.out.println("Enter Name :");
        name=read.nextLine();
        System.out.println("Enter Address :");
        address=read.nextLine();
        System.out.println("Enter Phone :");
        phone=read.next();
        System.out.println("Enter Opening Balance  :");
        balance=read.nextDouble();
        System.out.println("Your Account Successfully Created !");

        read.close();


       

    }
    public static String generate_accno(int length) {
    
        StringBuilder acno = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10);  // Generate a random digit between 0 and 9
            acno.append(digit);
        }

        return acno.toString();
    }
    void Display()
    {
        //this(); // this keyword is used to call class constructor
        System.out.println("Account Details ");
        System.out.println(accno+" "+name+" "+address+" "+phone+ " "+balance);
        System.out.println("Branch :"+branch);
        System.out.println("IFSC :"+IFSC);
        

    }
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: Rs." + balance);
        }
    }
     // Method to deposit money
     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    //getROI
    public double Get_roi()
    {
        return ROI;
    } 
   // read.close();

}
