public class Main {
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount johnDoeAccount = new BankAccount("John Doe", 1000.0);
        BankAccount janeSmithAccount = new BankAccount("Jane Smith", 2500.0);
        BankAccount bobJohnsonAccount = new BankAccount("Bob Johnson", 500.0);

        // Display bank name and interest rate
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");


        johnDoeAccount.displayAccountInfo();
        janeSmithAccount.displayAccountInfo();
        bobJohnsonAccount.displayAccountInfo();


        System.out.println("\n≡≡≡ Account Operations ≡≡≡");
        johnDoeAccount.deposit(500.0);  // John Doe deposits
        janeSmithAccount.withdraw(300.0);  // Jane Smith withdraws


        System.out.println("\n≡≡≡ Interest Calculation ≡≡≡");
        System.out.println("John Doe's interest: $" + johnDoeAccount.calculateInterest());
        System.out.println("Jane Smith's interest: $" + janeSmithAccount.calculateInterest());
        System.out.println("Bob Johnson's interest: $" + bobJohnsonAccount.calculateInterest());


        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}
