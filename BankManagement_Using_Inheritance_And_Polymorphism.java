import java.util.Scanner;

public class BankManagement_Using_Inheritance_And_Polymorphism {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter initial balance for saving account: $");
        double initialBalance = s.nextDouble();
        SavingAccount savingAccount = new SavingAccount(initialBalance, 0.05, 12);

        System.out.print("Enter initial balance for checking account: $");
        initialBalance = s.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(initialBalance);

        savingAccount.calculateInterest();

        System.out.print("Enter the amount to debit from the checking account: $");
        double debitAmount = s.nextDouble();
        checkingAccount.debit(debitAmount);

        System.out.print("Enter the amount to credit to the checking account: $");
        double creditAmount = s.nextDouble();
        checkingAccount.credit(creditAmount);

        System.out.println("Saving Account Balance: $" + savingAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());

    }
}



class Accounts {
    double balance;

    public Accounts(double balance) {
        this.balance = balance;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited: $" + amount);
        } else {
            System.out.println("Insufficient balance for debit.");
        }
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited: $" + amount);
        } else {
            System.out.println("Invalid credit amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends Accounts {
    double interestRate;
    int timeSpan;

    public SavingAccount(double balance, double interestRate, int timeSpan) {
        super(balance);
        this.interestRate = interestRate;
        this.timeSpan = timeSpan;
    }

    public void calculateInterest() {
        double interest = (balance * interestRate * timeSpan);
        System.out.println("Calculated Interest: $" + interest);
        credit(interest);
    }

    @Override
    public void credit(double amount) {
        super.credit(amount);
        System.out.println("Interest credited: $" + amount);
    }
}

class CheckingAccount extends Accounts {
    public CheckingAccount(double balance) {
        super(balance);
    }
}

