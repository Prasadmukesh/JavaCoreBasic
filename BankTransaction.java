class BankTransaction extends Thread {
    private String transactionType;

    public BankTransaction(String type) {
        this.transactionType = type;
    }

    @Override
    public void run() {
        System.out.println("Processing " + transactionType + " on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(transactionType + " completed on thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        BankTransaction t1 = new BankTransaction("Deposit");
        BankTransaction t2 = new BankTransaction("Withdrawal");
        BankTransaction t3 = new BankTransaction("Bill Payment");

        t1.start();
        t2.start();
        t3.start();
    }
}
