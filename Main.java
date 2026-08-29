import bank.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        bank bank = new bank();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("      BANK MANAGEMENT SYSTEM");
            System.out.println("================================");

            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Display Account Details");
            System.out.println("7. Transfer Money");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter your name: ");
                    String savingsName = sc.nextLine();

                    System.out.print("Enter your email: ");
                    String savingsEmail = sc.nextLine();

                    System.out.print("Enter initial balance: ");
                    double savingsBalance = sc.nextDouble();

                    savingsAccount savings = new savingsAccount(
                            savingsName,
                            savingsEmail,
                            savingsBalance);

                    bank.createAccount1(savings);

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter your name: ");
                    String currentName = sc.nextLine();

                    System.out.print("Enter your email: ");
                    String currentEmail = sc.nextLine();

                    System.out.print("Enter initial balance: ");
                    double currentBalance = sc.nextDouble();

                    currentAccount current = new currentAccount(
                            currentName,
                            currentEmail,
                            currentBalance);

                    bank.createAccount2(current);

                    break;

                case 3:

                    System.out.print(
                            "Enter account number: ");

                    int depositAccount = sc.nextInt();

                    System.out.print("Enter amount: ");

                    double depositAmount = sc.nextDouble();

                    bank.deposit(
                            depositAccount,
                            depositAmount);

                    break;

                case 4:

                    System.out.print(
                            "Enter account number: ");

                    int withdrawAccount = sc.nextInt();

                    System.out.print("Enter amount: ");

                    double withdrawAmount = sc.nextDouble();

                    bank.withdraw(
                            withdrawAccount,
                            withdrawAmount);

                    break;

                case 5:

                    System.out.print(
                            "Enter account number: ");

                    int balanceAccount = sc.nextInt();

                    bank.checkBalance(balanceAccount);

                    break;

                case 6:

                    System.out.print(
                            "Enter account number: ");

                    int detailsAccount = sc.nextInt();

                    bank.displayAccount(detailsAccount);

                    break;

                case 7:

                    System.out.print(
                            "Enter sender account number: ");

                    int sender = sc.nextInt();

                    System.out.print(
                            "Enter receiver account number: ");

                    int receiver = sc.nextInt();

                    System.out.print("Enter amount: ");

                    double transferAmount = sc.nextDouble();

                    bank.transferMoney(
                            sender,
                            receiver,
                            transferAmount);

                    break;

                case 8:

                    System.out.println(
                            "Thank you for using our bank!");

                    break;

                default:

                    System.out.println(
                            "Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}