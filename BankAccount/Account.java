package BankAccount;

class Account {
    private String accountName;
    private int accountNumber;
    private int accountBalance;
    private double money ;

    public Account(int accountBalance, String accountName, int accountNumber) {
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.money = 0;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void withdraw() {
        if (money > accountBalance) {
            System.out.println("Insufficient balance. Cannot withdraw " + money);
        } else if (money <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            accountBalance -= money;
            System.out.println("You have withdrawn " + money + ". Now your balance is " + accountBalance);
        }
    }

    public void deposit() {
        if (money <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            accountBalance += money;
            System.out.println("You have deposited " + money + ". Now your balance is " + accountBalance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + accountBalance);
    }
}
