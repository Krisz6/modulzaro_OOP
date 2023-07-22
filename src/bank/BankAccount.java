package bank;

public class BankAccount {
    private static final int minAccountNumber = 20;

    private String accountName;
    private int balance;
    private final int accountNumber;

    public BankAccount(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(int amount) throws NegativNumberExeption{
        if (amount <= 0) {
            throw new NegativNumberExeption();
        }
        balance += amount;
    }

    public void withdraw(int amount) throws NotEnoughMoneyExeption, NegativNumberExeption{
        if (amount <= 0) {
            throw new NegativNumberExeption();
        }
        if (amount > balance) {
            throw new NotEnoughMoneyExeption();
        }
        balance -= amount;
    }

    public void transfer(int amount, BankAccount targetAccount) throws NotEnoughMoneyExeption, NegativNumberExeption {
        if (amount <= 0) {
            throw new NegativNumberExeption();
        }
        if (amount > balance) {
            throw new NotEnoughMoneyExeption();
        }
        balance -= amount;
        targetAccount.deposit(amount);
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
