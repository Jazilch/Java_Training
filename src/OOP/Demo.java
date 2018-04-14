package OOP;

class Person {
  String name;
  String email;
  String phone;

  void walk() {
    System.out.println(name + " is walking");
  }

  void eat() {
    System.out.println(email);
  }
   void sleep() {
     System.out.println(name + " is sleeping");
  }
}

public class Demo {
  public static void main(String[] args) {
    Person person1 = new Person();

    // Define some properties
    person1.name = "James";
    person1.email = "jzilch@gmail.com";
    person1.phone = "4753742648";

    // Abstraction
    person1.walk();
    person1.sleep();
    person1.eat();
  }
}



