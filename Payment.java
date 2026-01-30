// Abstract class representing a payment
abstract class Payment {
    // Common method for all payment types, can be shared
    public void initiatePayment() {
        System.out.println("Initiating payment...");
    }
    
    // Abstract method, each payment method must implement this
    public abstract void processPayment();

    // Another abstract method to get payment details
    public abstract String getPaymentDetails();
}
