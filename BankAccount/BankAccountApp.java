package BankAccount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) throws IOException {
        // CheckingAccount checkA1 = new CheckingAccount("Marybeth Sanders", "431551383", "Checking", 2500);
        // CheckingAccount checkA2 = new CheckingAccount("Hattie Storey", "476687875", "Checking", 3500);
        // SavingAccount savingA1 = new SavingAccount("Arielle asdadsn", "444102638", "Savings", 1000);

        // checkA1.Transfer(1000, "Nick");

        List<String[]> NewBankAccount = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(
                "C:\\Users\\jianc\\OneDrive - Florida International University\\Documents\\Word Save\\JOB\\JavaHaveFun\\src\\BankAccount\\NewBankAccounts.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            NewBankAccount.add(values);
        }
        List<Account> accounts = new LinkedList<Account>();
        for (String[] AccountInfo : NewBankAccount) {
            // System.out.println(AccountInfo[0]);
            // System.out.println(AccountInfo[1]);
            // System.out.println(AccountInfo[2]);
            // System.out.println(AccountInfo[3]);
            String name = AccountInfo[0];
            String SSN = AccountInfo[1];
            String AccountType = AccountInfo[2];
            double InitialDeposit = Double.parseDouble(AccountInfo[3]);
            // System.out.println("Name: " + name + " and SSN: " + SSN + " and Account Type: " + AccountType
            //         + " and Initial Deposite: $" + InitialDeposit);
            if(AccountType.equals("Checking")){
                accounts.add(new CheckingAccount(name, SSN, AccountType, InitialDeposit));

            }else if(AccountType.equals("Savings")){
                accounts.add(new SavingAccount(name, SSN, AccountType, InitialDeposit));
            }else{
                System.out.println("Sorry!!! System can not catch the account type");
            }
        }

        // savingA1.ShowInfo();
        // savingA1.GetSafetyDepositCode();
        // savingA1.GetSafetyDepositNum();

        //The main method can be use for is ShowInfo(), Deposite (), Withdraw() CheckingOrSavings()
        //For the Transfer(), right now it just simply can done for transfer money from 
        accounts.get(0).Transfer(500, accounts.get(1).name);
        accounts.get(1).ShowInfo();
    }
}
