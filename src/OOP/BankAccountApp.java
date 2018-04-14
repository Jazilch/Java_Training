package OOP;

public class BankAccountApp {
  public static void main(String[] args) {
    // Creating a new bank account

    BankAccount acc1 = new BankAccount();
    acc1.accountNumber = "32582739812";
    acc1.setName("James Zilch");
    System.out.println(acc1.getName());
    acc1.setSsn("4828429418");
    acc1.balance = 10000;
    acc1.deposit(1500);
    acc1.deposit(1500);
    acc1.deposit(1500);
    acc1.deposit(1500);
    System.out.println(acc1.toString());

    BankAccount acc2 = new BankAccount("Checking Account");
    acc2.accountNumber = "9572498524";

    BankAccount acc3 = new BankAccount("Savings Account", 5000);
    acc3.accountNumber = "347293842p";
    acc3.checkBalance();

    CDAccount cd1 = new CDAccount();
    cd1.balance = 3000;
//    cd1.name = "John";
    cd1.accountType = "CD Account";
    System.out.println(cd1.toString());
    cd1.compound();

  }
}
