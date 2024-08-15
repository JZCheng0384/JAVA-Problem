package BankAccount;

import java.util.Scanner;

public class CheckingAccount extends Account {
    // Here will be all the properties that inside a Checking account
    // Account Number hold 11-Digits follow by 1 or 2 depend on Saving or Checking
    // last two digits of SSN, unqiue 5-digits number and random 3-digits number
    // Checking account holders a signed Debit Card with 12-digits number and
    // 4-digits PIN
    // Checking account will having 15% of the base rate
    int DebitCardNum;
    int DebitCardPin;

    String CheckingAccountNum;

    public CheckingAccount(String name, String SSN, String AccountType, double InitialDeposit) {
        super(name, SSN, AccountType, InitialDeposit);

        // Account Number hold 11-Digits follow by 1 or 2 depend on Saving or Checking
        this.CheckingAccountNum = "1" + accountNumber;
        GetDebitCardNum();
        GetDebitCardPin();

        // System.out.println("---------------------------------------------------------------");
        // System.out.println("ACCOUNT NUMBER IS: "+CheckingAccountNum);
    }

    // Checking account holders a signed Debit Card with 12-digits number and
    // 4-digits PIN
    public void GetDebitCardNum() {
        DebitCardNum = (int) (Math.random() * Math.pow(10, 12));
        // System.out.println("The Debit Card Number is: " + DebitCardNum);
    }

    public void GetDebitCardPin() {
        DebitCardPin = (int) (Math.random() * Math.pow(10, 4));
        // System.out.println("The Debit Card Pin is: " + DebitCardPin);
    }

    // Checking account will having 15% of the base rate
    @Override
    public void SetRate() {
        rate = CheckRate() * 0.15;
    }

    public void ShowInfo() {
        super.ShowInfo(); // use super to not override everything
        Scanner in = new Scanner(System.in);
        System.out.println("Are you the people of this account: " + name + " ?  Y/N");
        String ans = in.nextLine();
        if (ans.equals("Yes") || ans.equals("yes") || ans.equals("Y") || ans.equals("y")) {
            System.out.println("The Checking Account Number is: " + CheckingAccountNum + "\nThe Debit Card Number is: "
                    + DebitCardNum
                    + "\nThe Debit Card Pin is: " + DebitCardPin);
            System.out.println("---------------------------------------------------------------");
        } else if (ans.equals("No") || ans.equals("no") || ans.equals("N") || ans.equals("n")) {
            System.out.println("Sorry, We only prvoide this private info to the right people");
        } else {
            System.out.println("ERRORRRR");
        }
    }

    // Create a unique 12 digit from checking account

}
