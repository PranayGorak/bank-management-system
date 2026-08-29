package bank;

public abstract class account implements transaction {

    private static int nextAccountNumber = 1001;

    private int accountNumber;
    private String name;
    private String email;
    private double balance;

    public account() {
        this.accountNumber = nextAccountNumber++;
        this.name = "unknown";
        this.email = "unknown";
        this.balance = 0;

    }

    public account(String name, String email, double balance) {
        this.accountNumber = nextAccountNumber++;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("$" + amount + "DEPOSITED SUCCESSFULLY.");

        } else {
            System.out.println("Invalid amount");

        }
    }

    @Override

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("$" + amount + "WITHDRAWN SUCCESSFULLY.");

        } else {
            System.out.println("INSUFFICIENT BALANCE OR INVALID AMOUNT.");
        }

    }

    public void displayDetails() {
        System.out.println("\n----------ACCOUNT DETAILS----------");
        System.out.println("Account number:" + accountNumber);
        System.out.println("Name:" + name);
        System.out.println("email:" + email);
        System.out.println("Account Balance: $" + balance);

    }

    public void displayDetails(boolean showBalance) {
        System.out.println("\n----------ACCOUNT DETAILS----------");
        System.out.println("Account number:" + accountNumber);
        System.out.println("Name:" + name);
        System.out.println("email:" + email);

        if (showBalance) {
            System.out.println("Balance:$" + balance);
        }
    }

    public abstract void accountType();

}
