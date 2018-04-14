package OOP;

public class AccountApp {

  public static void main(String[] args) {
    LoanAccount la = new LoanAccount();
    la.increaseRate();
    la.setRate();
    la.setAmountSchedule();
    la.setTerm(20);


    // Polymorphism changes where we are pointing
    IRate account1 = new LoanAccount();
    account1.increaseRate();
    account1.setRate();
  }
}
