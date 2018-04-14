package JavaTraining;

public class NumbersCalc {

  public static void main(String[] args) {
    printName();

    int numA = 10;
    int numB = 20;
    addNumbers(numA, numB);
    int product = multiplyNumbers(numA, numB);
    System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
  }

  static void printName() {
    System.out.println("My name is James");
  }

  static void addNumbers(int numberA, int numberB) {
    int sum = numberA + numberB;
    System.out.println("The sum of number " + numberA + " and " + numberB + " is " + sum);
  }

  static int multiplyNumbers(int valueA, int valueB) {
    int product = valueA * valueB;
    addNumbers(product + 50, product);
    return product;
  }

}
