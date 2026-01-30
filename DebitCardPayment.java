class DebitCardPayment extends Payment {
    private String cardNumber;
    private String bankName;
    
    public DebitCardPayment(String cardNumber, String bankName) {
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing debit card payment through bank: " + bankName);
    }

    @Override
    public String getPaymentDetails() {
        return "Debit Card Payment: " + bankName + " - " + cardNumber;
    }
}
