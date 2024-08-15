package BankAccount;

public class SavingAccount extends Account {
    // Here will be all the properties that inside a Checking account
    // Account Number hold 11-Digits follow by 1 or 2 depend on Saving or Checking
    // last two digits of SSN, unqiue 5-digits number and random 3-digits number
    // Saving account holders given a Safety Deposit Box, identified by 3-digits
    // number and accessed with 4-digit code
    // Saving account will having 0.25 less than the base rate

    int SafetyDepositNum;
    int SafetyDepositCode;
    String SavingAccountNum;

    public SavingAccount(String name, String SSN, String AccountType, double InitialDeposit) {

        super(name, SSN, AccountType, InitialDeposit);
        // System.out.println("ACCOUNT NUMBER IS: "+"2"+accountNumber);
        // System.out.println("SAVINGGGGGGGGGG ORDER");
        // System.out.println("Name: " + name + "\nSSN: " + SSN + "\nAccount Type: " +
        // AccountType
        // + "\nInitial Deposite: $" + InitialDeposit);
        this.SavingAccountNum = "2" + accountNumber;

        GetSafetyDepositCode();
        GetSafetyDepositNum();
        // System.out.println("---------------------------------------------------------------");
    }

    private void GetSafetyDepositCode() {
        SafetyDepositCode = (int) (Math.random() * Math.pow(10, 4));
        // System.out.println("The Safety Deposit Code is: " + SafetyDepositCode);
    }

    private void GetSafetyDepositNum() {
        SafetyDepositNum = (int) (Math.random() * Math.pow(10, 3));
        // System.out.println("The Safety Deposit Number is: " + SafetyDepositNum);
    }

    // Saving account will having 0.25 less than the base rate
    @Override
    public void SetRate() {
        rate = CheckRate() - 0.25;
    }

    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("The Saving Account Number is: " + SavingAccountNum + "\nThe Safety Deposit Code is: "
                + SafetyDepositCode + "\nThe Safety Deposit Number is: " + SafetyDepositNum);
    }

}
