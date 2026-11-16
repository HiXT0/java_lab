// Abstract class
abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    public Accounts(String accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    // Abstract methods to be implemented by subclass
    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    // Concrete method
    public void display() {
        System.out.println("Account Number: " + accountNumber + " | Balance: ₹" + balance);
    }
}

// Subclass
class SavingsAccount extends Accounts {
    private double rateOfInterest;

    public SavingsAccount(String accountNumber, String accountHoldersName, String address, double balance, double rateOfInterest) {
        super(accountNumber, accountHoldersName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to calculate interest amount and add to balance
    public void calculateAmount() {
        double interest = balance * (rateOfInterest / 100);
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}

// Driver Class
public class AbstractClassDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", "Prateek Kumar", "Kolkata", 10000.0, 5.0);
        
        System.out.println("Initial Details:");
        sa.display();
        
        sa.deposit(2000);
        sa.display();
        
        sa.withdrawal(1500);
        sa.display();
        
        sa.calculateAmount(); // Adds 5% interest
        sa.display();
    }
}
