public class PaymentSystem {
    public static void main(String[] args) {
        // Create instances of different payment methods
        Payment creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        Payment debitCard = new DebitCardPayment("1111-2222-3333-4444", "AXIS Bank");
        Payment mobilePayment = new MobilePayment("9876543210");
        
        // Process payments using common method
        creditCard.initiatePayment();
        creditCard.processPayment();
        System.out.println(creditCard.getPaymentDetails());
        
        debitCard.initiatePayment();
        debitCard.processPayment();
        System.out.println(debitCard.getPaymentDetails());
        
        mobilePayment.initiatePayment();
        mobilePayment.processPayment();
        System.out.println(mobilePayment.getPaymentDetails());
    }
}
