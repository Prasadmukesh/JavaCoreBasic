class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment for card number: " + cardNumber);
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment: " + cardHolderName + " - " + cardNumber;
    }
}
