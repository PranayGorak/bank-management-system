package bank;

public class currentAccount extends account {
    private double overdraftLimit;

    public currentAccount() {
        super();
        overdraftLimit = 5000;
    }

    public currentAccount(String name, String email, double balance) {
        super(name, email, balance);
        overdraftLimit = 5000;
    }

    @Override
    public void accountType() {
        System.out.println("Account type: Current Account");

    }

    public void showInterestRate() {
        System.out.println("Overdraft limit: $" + overdraftLimit);
    }
}
