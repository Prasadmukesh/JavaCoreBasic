class TestBAccount {
public static void main(String[] args)
{
    BAccount c1=new BAccount();
    c1.setAcc_no(1111000112345L);
    c1.setName("Akhil yadav");
    c1.setEmail("akhil123@java.com");
    c1.setAmount(25000);
    System.out.println("Account No :"+c1.getAcc_no());
   // System.out.println("Account No :"+c1.acc_no);  // c T error 
    System.out.println("Name :"+c1.getName());
    System.out.println("Email :"+c1.getEmail());
    System.out.println("Balance :"+c1.getAmount());

    BAccount c2=new BAccount();
    c2.setAcc_no(1111000656672L);
    c2.setName("Shivani yadav");
    c2.setEmail("shivangi@java.com");
    c2.setAmount(24000);
    System.out.println("Account No "+c2.getAcc_no());
    System.out.println("Name "+c2.getName());
    System.out.println("Email "+c2.getEmail());
    System.out.println("Balance "+c2.getAmount());
}
    
}
