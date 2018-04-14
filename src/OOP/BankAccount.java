package OOP;

public class BankAccount implements IRate {
  // Define variables
  String accountNumber;

  // static >> belongs to the CLASS not the object instance

  private static final String routingNumber = "34752985722";
  private String name;
  private String ssn;
  String accountType;
  double balance;


  // Constructor definitions
    // 1. Used to define or set init properties of an object
    // 2. Implicitly called upon
    // 3. Same name as class
    // 4. Constructors have NO return type
  BankAccount() {
    System.out.println("New Account Created");
  }
  BankAccount(String accountType) {
    System.out.println("New account: " + accountType);
  }
  BankAccount(String accountType, double initDeposit) {
    System.out.println("New Account: " + accountType);
    System.out.println("Initial deposit of " + initDeposit);
    String Msg = null;
    if (initDeposit < 1000) {
      Msg = "ERROR: Minimum deposit must be at least $1000";
    } else {
      Msg = "Thanks for your initial deposit of $" + initDeposit;
    }
    System.out.println(Msg);
    balance = initDeposit;
  }

  // Getters and Setters
  // Allow the user to define the name
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public BankAccount setSsn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  // Interface methods
  public void setRate() {
    System.out.println("SETTING RATE");
  }

  public void increaseRate() {
    System.out.println("INCREASING RATE");
  }

  public String getSsn() {
    return ssn;
  }

  public void deposit(double amount){
    balance = balance + amount;
    showActivity("DEPOSIT");
  }

  void withdraw(double amount) {
    balance = balance - amount;
    showActivity("WITHDRAW");
  }

  private void showActivity(String activity) {
    System.out.println("Your Recent Transition: " + activity);
    System.out.println("Your new balance is: $" + balance);
  }

  void checkBalance() {
    System.out.println("Balance: " + balance);
  }
  void getStatus() {

  }

  @Override
  public String toString() {
    return "[ " + name + ". " + accountNumber + ". BALANCE $" + balance + "]";
  }

}
