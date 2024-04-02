package Com.corjavaeigth;

//Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Bank account class
class BankAccount {
 private double balance;

 // Constructor
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Method to perform transactions (deposits and withdrawals)
 public void performTransaction(double amount) throws InsufficientFundsException {
     if (amount < 0) {
         throw new IllegalArgumentException("Amount must be positive.");
     }

     // Check if withdrawal amount exceeds balance
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds for withdrawal. Transaction cancelled.");
     }

     // Perform transaction
     balance += amount;
 }

 // Method to get account balance
 public double getBalance() {
     return balance;
 }
}

//Main class to demonstrate usage
public class BankAccountSimulation {
 public static void main(String[] args) {
     // Create a bank account with initial balance of $1000
     BankAccount account = new BankAccount(1000);

     // Perform transactions
     try {
         // Deposit $500
         account.performTransaction(500);
         System.out.println("Deposit of $500 successful. New balance: $" + account.getBalance());

         // Withdraw $200
         account.performTransaction(-200);
         System.out.println("Withdrawal of $200 successful. New balance: $" + account.getBalance());

         // Attempt to withdraw $1500 (should throw InsufficientFundsException)
         account.performTransaction(-1500);
         System.out.println("Withdrawal of $1500 successful. New balance: $" + account.getBalance());
     } catch (InsufficientFundsException e) {
         // Catch and handle InsufficientFundsException
         System.out.println("Insufficient funds: " + e.getMessage());
     } catch (IllegalArgumentException e) {
         // Catch and handle IllegalArgumentException
         System.out.println("Invalid transaction: " + e.getMessage());
     }
 }
}

