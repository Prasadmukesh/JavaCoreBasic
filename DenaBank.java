import java.util.Scanner;

class DenaBank extends BankSys {
    public static void Change()
    {
        branch="SilkBoard II";
        IFSC="DNB0001018";
        ROI=8.5;
    }
   
    public static void main(String[] args)
    {
        DenaBank.Change();
        DenaBank c1= new DenaBank();
        //c1.OpenAccount();
    
       // c1.Display();
        //System.out.println("ROI :"+c1.Get_roi());
        Scanner sc= new Scanner(System.in);
              
while(true)
{
        
        System.out.println("***WELCOME TO DENA BANK SYSTEM****");
        System.out.println("1.Account Open"+"\n"+"2. Display"+"\n"+"3.WithDrawal "+"\n"+"4.Deposit "+"\n"+"\n"+"5.SHOW ROI"+"\n"+"0.Exit");
        System.out.println("**********************************");
        System.out.println("Enter Option: ");
        int op=sc.nextInt();
        
        switch(op) {
            case 1:
                c1.OpenAccount();
                
                break;
            case 2:
                c1.Display();
                break;
            case 3:
            System.out.println("Enter Amout :");
            double amount=sc.nextDouble();
            c1.withdraw(amount);
            break;
            case 4:
            System.out.println("Enter Amout :");
            double amt=sc.nextDouble();
            c1.deposit(amt);
            break;
            case 5:
            System.out.println("ROI "+ c1.Get_roi());
            break;

            case 0:
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid Option");
                break;
        }
       // sc.close();
 
    }

}
}
