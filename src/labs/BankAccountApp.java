package labs;

public class BankAccountApp {

  public static void main(String[] args) {
    BankAccount acc1 = new BankAccount("398724983472", 1000);
    BankAccount acc2 = new BankAccount("398471398479", 2000);
    BankAccount acc3 = new BankAccount("384398429833", 2500);

    acc1.setName("Jim");
    System.out.println(acc1.getName());
    acc1.makeDeposit(500);
    acc1.makeDeposit(500);
    acc1.payBill(1000);
    acc1.accrue();
    System.out.println(acc1.toString());
  }

}

class BankAccount implements IInterest {
  //Properties of bank account
  private static int iD = 1001;               // Internal ID
  private String accountNumber; // iD + random 2-digit number + first 2 of SSN
  private static final String routingNumber = "00482823781";
  private String name;
  private String SSN;
  private double balance;

  // Constructors
  public BankAccount(String SSN, double initDeposit) {
    balance = initDeposit;
    this.SSN = SSN;
    iD++;
    setAccountNumber();
  }

  private void setAccountNumber() {
    int random = (int) (Math.random() * 100);
    accountNumber = iD + "" + random + SSN.substring(0, 1);
    System.out.println("Your account number is: " + accountNumber);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void payBill(double amount) {
    balance = balance - amount;
    showBalance();
  }

  public void makeDeposit(double amount) {
    balance = balance + amount;
    showBalance();
  }

  public void showBalance() {
    System.out.println("Balance: " + balance);
  }
  @Override
  public void accrue() {
    balance = balance * (1 + rate/100);
    showBalance();
  }

  @Override
  public String toString() {
    return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance " + balance + "]";
  }
}
