import java.util.Scanner;

class TestBankSys {
    public static void main(String[] args) {
        BankSys customer1=new BankSys();
        BankSys customer2=new BankSys("Shivani","banglore","757655655",10000.95);
        BankSys customer3=new BankSys("Shivani gupta","Delhi","759955655",1000.95);
        customer1.Display();
        customer2.Display();
        customer3.Display();
       
//         Scanner sc=new Scanner(System.in);
//          BankSys customer4=new BankSys();
//         // customer4.OpenAccount();
//         // customer4.Display();
       
// while(true)
// {
        
//         System.out.println("***WELCOME TO BANKSYSTEM****");
//         System.out.println("1.Account Open"+"\n"+"2. Display"+"\n"+"3.WithDrawal "+"\n"+"4.Deposit "+"\n"+"\n"+"5.SHOW ROI"+"\n"+"0.Exit");
//         System.out.println("**********************************");
//         System.out.println("Enter Option: ");
//         int op=sc.nextInt();
        
//         switch(op) {
//             case 1:
//                 customer4.OpenAccount();
                
//                 break;
//             case 2:
//                 customer4.Display();
//                 break;
//             case 3:
//             System.out.println("Enter Amout :");
//             double amount=sc.nextDouble();
//             customer4.withdraw(amount);
//             break;
//             case 4:
//             System.out.println("Enter Amout :");
//             double amt=sc.nextDouble();
//             customer4.deposit(amt);
//             break;
//             case 5:
//             System.out.println("ROI "+ customer4.Get_roi());
//             break;

//             case 0:
//                 sc.close();
//                 System.exit(0);
//             default:
//                 System.out.println("Invalid Option");
//                 break;
//         }
//        // sc.close();
         
//     }
       
}
    
}
