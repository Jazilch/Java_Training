package JavaTraining;

public class SalaryCalculator {
  public static void main(String[] args) {
    // create a variable to define a career
    String career;
    System.out.println("Program is starting");
    career = "Software Developer";
    System.out.println("My career is: " + career);

    // Declare and define
    int hoursPerWeek = 40;
    int weeksPerYear = 50;
    double rate = 42.50;

    double salary = hoursPerWeek * weeksPerYear * rate;
    System.out.println("My salary is: " + salary);


    // compute annual salary
    // rate * hours by week * weeks per year
  }
}
