package BankAccount;

public abstract class Account implements Rate {
    String name;
    String sSN;
    String accountType;
    double initialDeposit;
    String accountNumber;
    static int unqiueNum = 10000;
    double rate;

    public Account(String name, String sSN, String accountType, double initialDeposit2) {
        this.name = name;
        this.sSN = sSN;
        this.initialDeposit = initialDeposit2;
        this.accountType = accountType;
        // System.out.println("NAME: "+name+"\nSSN:"+sSN+"\nBALANCE: "+initialDeposit);
        this.accountNumber = SetAccountNum();
        SetRate();
        // System.out.println("ACCOUNT NUMBER IS: "+ accountNumber);
    }

    public abstract void SetRate();

    // Account Number hold 11-Digits follow by 1 or 2 depend on Saving or Checking
    // last two digits of SSN, unqiue 5-digits number and random 3-digits number
    private String SetAccountNum() {
        accountNumber = sSN.substring(sSN.length() - 2, sSN.length()) + unqiueNum
                + (int) (Math.random() * Math.pow(10, 3));
        unqiueNum++;
        return accountNumber;

    }

    /* Transfer method */
    public void Transfer(double amount, String TransferName) {
        System.out.println(name + " Your tranfer amount is: $" + amount + " to " + TransferName);
        System.out.println("You reminding balance is: $" + (initialDeposit - amount));
    }

    /* Deposite method */
    public void Deposite(double amount) {
        System.out.println("You deposit amount is: $" + amount);
        System.out.println("Your total balance is: $" + (initialDeposit + amount));
    }

    /* Withdraw method */
    public void Withdraw(double amount) {
        System.out.println("You withdraw amount is: $" + amount);
        System.out.println("You reminding balance is: $" + (initialDeposit - amount));
    }

    /* Method to check which type of account type */
    public void CheckingOrSavings() {
        if (accountType.equals("Checking"))
            System.out.println(name + ",This account is a Checking Account");
        if (accountType.equals("Savings"))
            System.out.println(name + ",This account is a Savings Account");
    }

    /* Show infonmation method */
    public void ShowInfo() {
        System.out.println("Name: " + name + "\nSSN: " + sSN + "\nAccoount Number: " + accountNumber + "\nBalance: $"
                + initialDeposit + "\nRate is: " + rate + "%");
    }

}
