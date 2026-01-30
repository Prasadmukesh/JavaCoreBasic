import java.util.Scanner;

class MenuDriven {
    public void Menu()
    {
        System.out.println("**********Billing System***********");
        System.out.println(" Fast Food Menu");
        System.out.println("1.Pizza Rs. 179.00");
        System.out.println("2.Burger Rs. 79.00");
        System.out.println("3.Pasta Rs. 120.00");
        System.out.println("4.Noodle Rs. 100.00");
        System.out.println("0.Exit");
        System.out.println("**********Billing System***********");
        

    }
    public static void main(String[] args) {
      MenuDriven mn=new MenuDriven();
      mn.Menu();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter option :"); 
      int option=sc.nextInt();
      double bill;
      int qnty;
      
      switch (option) {
        case 1:
            System.out.println("Enter Quantity :");
            qnty=sc.nextInt();
            bill=qnty*179.00;
            System.out.println("Your Bill Rs."+bill);
            System.out.println("Have a Nice Day");
            break;
        case 2:
            System.out.println("Enter Quantity :");
            qnty=sc.nextInt();
            bill=qnty*79.00;
            System.out.println("Your Bill Rs."+bill);
            System.out.println("Have a Nice Day");
            break;
        case 3:
            System.out.println("Enter Quantity :");
            qnty=sc.nextInt();
            bill=qnty*120.00;
            System.out.println("Your Bill Rs."+bill);
            System.out.println("Have a Nice Day");
            break;
        case 4:
            System.out.println("Enter Quantity :");
            qnty=sc.nextInt();
            bill=qnty*100.00;
            System.out.println("Your Bill Rs."+bill);
            System.out.println("Have a Nice Day");
            break;

        case 0:
            System.exit(0);
      
        default:
            System.out.println("Invalid Option");
            break;
      } 
      sc.close();
    }
    
}
