// Interface representing the Bank
interface Bank {
    String bankName = "State Bank of India"; // Variables in interfaces are public static final by default
    void displayBankDetails();
}

// Parent class representing a Customer
class Customer {
    String customerName;
    String customerId;

    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}

// Child class representing an Account that extends Customer and implements Bank
class Account extends Customer implements Bank {
    String accountNumber;
    double balance;

    public Account(String customerName, String customerId, String accountNumber, double balance) {
        super(customerName, customerId);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }

    public void displayAccountDetails() {
        displayBankDetails();
        displayCustomerDetails();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Driver Class
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Account myAccount = new Account("Prateek Kumar", "CUST1001", "ACC987654321", 50000.0);
        myAccount.displayAccountDetails();
    }
}
