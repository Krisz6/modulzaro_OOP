package bank;

public class Test {
    public static void main(String[] args) throws NegativNumberExeption, NotEnoughMoneyExeption {
        BankAccount account1 = new BankAccount("Egyeske", 12345678);
        BankAccount account2 = new BankAccount("Ketteske", 23456789);

        System.out.println("Beteszek 20000-et!");
        account1.deposit(20000);
        System.out.println("Jelenlegi összeg: " + account1.getBalance());
        System.out.println();
        System.out.println("Kiveszek 10000-et!");
        account1.withdraw(10000);
        System.out.println("Jelenlegi összeg: " + account1.getBalance());
        System.out.println();
        System.out.println("Átutalok 8000-et!");
        account1.transfer(8000, account2);
        System.out.println("Jelenlegi összeg: " + account1.getBalance());
        System.out.println();
        System.out.println("Bankszámla 1: " + account1.getAccountName() + ", Egyenleg: " + account1.getBalance());
        System.out.println("Bankszámla 2: " + account2.getAccountName() + ", Egyenleg: " + account2.getBalance());
    }
}
