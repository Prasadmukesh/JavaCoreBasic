class MobilePayment extends Payment {
    private String mobileNumber;
    
    public MobilePayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override    //Annotation
    public void processPayment() {
        System.out.println("Processing mobile payment for number: " + mobileNumber);
    }

    @Override
    public String getPaymentDetails() {
        return "Mobile Payment: " + mobileNumber;
    }
}
