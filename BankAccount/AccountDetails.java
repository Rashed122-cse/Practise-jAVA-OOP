package BankAccount;

import java.util.Scanner;

public class AccountDetails {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter account name: ");
        String accountName = sc.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter initial balance: ");
        int accountBalance = sc.nextInt();

        Account account = new Account(accountBalance, accountName, accountNumber);
        account.displayAccountDetails();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.setMoney(depositAmount);
        account.deposit();

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.setMoney(withdrawAmount);
        account.withdraw();

        sc.close();
    }
}
