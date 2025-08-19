public class BankAccount {

    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03; // 3%


    String accountNumber;
    String accountHolderName;
    double balance;


    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
        totalAccounts++;
    }


    public static String generateAccountNumber() {
        return "ACC" + String.format("%03d", totalAccounts + 1); // e.g., ACC001, ACC002
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdraw $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(accountHolderName + " has insufficient funds to withdraw $" + amount);
        }
    }


    public double calculateInterest() {
        return balance * interestRate;
    }


    public void displayAccountInfo() {
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName + " with initial balance: $" + balance);
    }
}
