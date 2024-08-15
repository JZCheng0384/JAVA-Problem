package BankAccount;

public interface Rate {
    default double CheckRate(){
        return 2.5;
    }
    
}