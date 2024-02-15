//        Let's assume you are developing a simple bank account management system. Create a Java class called
//        BankAccount with the following attributes and methods:
//        Attributes:
//        • accountNumber (String)
//        • accountHolderName (String)
//        • balance (double)
//        Methods:
//        • deposit(double amount): Adds the given amount to the account's balance.
//        • withdraw(double amount): Subtracts the given amount from the account's balance, but
//        ensures that the balance never goes negative.
//        Use appropriate setter and getter methods for the attributes of class
//        Now, create a program that demonstrates the use of the BankAccount class by creating an instance of
//        it, depositing and withdrawing money, and displaying the account details.

import java.util.Scanner;
public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter the account number: ");
        account.setAccountNumber(s.nextLine());
        System.out.print("Enter the account holder's name: ");
        account.setAccountHolderName(s.nextLine());
        System.out.print("Enter the initial balance: $");
        double initialBalance = s.nextDouble();
        account.setBalance(initialBalance);
        System.out.println("\nInitial Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: $" + account.getBalance());
        System.out.print("\nEnter the amount to deposit: $");
        double depositAmount = s.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter the amount to withdraw: $");
        double withdrawAmount = s.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("\nUpdated Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: $" + account.getBalance());
    }
}
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount() {//default constructor
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;//instance
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance < 0) {//making sure the balance is never -ve
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount should be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn $" + amount);
            } else {
                System.out.println("Insufficient balance. Cannot withdraw $" + amount);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount should be positive.");
        }
    }
}