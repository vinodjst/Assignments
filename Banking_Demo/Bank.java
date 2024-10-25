package Assignment_Java.Banking_Demo;

public class Bank {
    public void manageAccounts(){
        SavingsAccount sa = new SavingsAccount();

        Account savingsAccount = new SavingsAccount();


        sa.setAccountNumber(12345);
        sa.setAccountHolderName("chandu");
        sa.setBalance(10000);
        sa.setInterestRate(8);

        sa.deposit(1000);

        sa.displayDetails();

        sa.withdraw(500);

        sa.displayDetails();

        CurrentAccount ca = new CurrentAccount();

        ca.setAccountNumber(86795);
        ca.setAccountHolderName("venky");
        ca.setBalance(20000);
        ca.setOverdraftLimit(200000);

        ca.deposit(5000);

        ca.displayDetails();

        ca.withdraw(15000);

        ca.displayDetails();
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.manageAccounts();
    }
}
