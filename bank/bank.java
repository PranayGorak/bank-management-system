package bank;

public class bank {
    private account account1;
    private account account2;

    public bank() {
        account1 = null;
        account2 = null;
    }

    public void createAccount1(account account) {
        if (account1 == null) {
            account1 = account;
            System.out.println("Account created successfully.");
            System.out.println(
                    "Your Account Number:" +
                            account.getAccountNumber());
        } else {
            System.out.println("first account already exists");
        }
    }

    public void createAccount2(account account) {

        if (account2 == null) {
            account2 = account;

            System.out.println("Account created successfully.");
            System.out.println(
                    "Your Account Number: " +
                            account.getAccountNumber());

        } else {
            System.out.println("Second account already exists.");
        }
    }

    public account findAccount(int accountNumber) {
        if (account1 != null && account1.getAccountNumber() == accountNumber) {
            return account1;
        }
        if (account2 != null && account2.getAccountNumber() == accountNumber) {
            return account2;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);

        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void checkBalance(int accountNumber) {
        account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println(
                    "Current Balance: ₹" +
                            account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccount(int accountNumber) {

        account account = findAccount(accountNumber);

        if (account != null) {

            account.displayDetails();
            account.accountType();

        } else {
            System.out.println("Account not found.");
        }
    }

    public void transferMoney(int senderNumber, int receiverNumber, double amount) {
        account sender = findAccount(senderNumber);
        account receiver = findAccount(receiverNumber);

        if (sender == null || receiver == null) {
            System.out.println("One or both accounts not found.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        if (amount > sender.getBalance()) {
            System.out.println("Insufficient balance");
            return;
        }
        sender.withdraw(amount);
        receiver.deposit(amount);

        System.out.println("money transfered successfully");
    }

}
