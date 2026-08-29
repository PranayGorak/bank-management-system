package bank;

public class savingsAccount extends account {
    double interestRate;

    public savingsAccount() {
        super();
        interestRate = 4.0;
    }

    public savingsAccount(String name, String email, double balance) {
        super(name, email, balance);
        interestRate = 4.0;
    }

    @Override
    public void accountType() {
        System.out.println("Account type: Savings Account");
    }

    public void showInterestRate() {
        System.out.println("Interest rate:" + interestRate + "%");

    }

}
