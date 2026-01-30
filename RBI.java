public interface RBI {
    default void Mesage()
    {
        System.out.println("*****Welcome to Banking System*****");
    }
    static double rateofinterest()
    {
        return 7.9f;
    }

    void OpenAccount();
    void BalanceEnquiry();
    void Credit();
    void Debit();
    void GetLoan();
    void HireLoacker();
}
