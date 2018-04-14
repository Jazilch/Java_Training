package JavaTraining;

public class weather {
  public static void main(String[] args) {
    // This program will give suggestions based on the weather

    int temperature = 70;
    String sunCondition = "Sunny";

    if (temperature > 80) {
      System.out.println("It's pleasant, wear shorts and a t-shirt");
    }
    else if ((temperature > 60) && (sunCondition == "Sunny")) {
      System.out.println("It's cooler, wear a long sleeve and jeans");
      System.out.println("Wear a hat to keep the sun out of eyes");
    }
    else if ((temperature > 50) || (sunCondition == "Overcast")) {
      System.out.println("This is a cooler day, make sure to wear sleeves");
    }
    else {
      System.out.println("It's chilly, grab a jacket");
    }
    System.out.println("Program ending");
  }
}
