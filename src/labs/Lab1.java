package labs;

public class Lab1 {

  public static void main(String[] args) {
    // Take an int into Sum and then return n +

    // Run factorial expression
    System.out.println(Factorials(8));

  }

  // Question #1
  public static int Sum(int[] numbers) {
    int sum = 0;
    for(int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }
    return sum;
  }

  // Question #2
  public static int Factorials(int n) {
    if (n == 0) {
      return 1;
    }
    else if (n == 1) {
      return 1;
    }
    return Factorials(n - 1) * n;
  }

}
