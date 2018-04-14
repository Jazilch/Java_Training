package labs;

public class StudentDatabase {

  public static void main(String[] args) {
    Student stu1 = new Student("James", "3284194839");
    Student stu2 = new Student("Thomas", "3753752958");
    Student stu3 = new Student("Sarah", "2953853857");

    stu1.enroll("Math151");
    stu1.enroll("Eng255");
    stu1.enroll("His211");

//    stu1.showCourses();
//    stu1.checkBalance();
    stu1.payTution(600);
//    stu1.checkBalance();
    System.out.println(stu1.toString());

  }
}

class Student {
  private static int iD = 10;
  private String userId;
  private  String name;
  private String ssn;
  private String email;
  private String phone;
  private String city;
  private String states;
  public String courses = "";
  private static final int costOfCourse = 800;
  private int balance =0;


  public Student(String name, String ssn) {
    iD++;
    this.name = name;
    this.ssn = ssn;
    setUserId();
    setEmail();

  }
  public Student setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public String getPhone() {
    return phone;
  }

  public String getCity() {
    return city;
  }

  public String getStates() {
    return states;
  }

  private void setEmail() {
    email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
    System.out.println("Your email: " + email);
  }

  public String getEmail() {
    return email;
  }

  private void setUserId() {
    int max = 9000;
    int min = 1000;
    int randNum =  (int) (Math.random() * ((max - min)));
    randNum = randNum + min;
    userId = iD + "" + randNum + ssn.substring(5);
    System.out.println("Your User ID: " + userId);
  }
  public void enroll(String course) {
    this.courses = this.courses + "\n" + course;
    System.out.println(courses);
    balance = balance + costOfCourse;
  }

  public void payTution(int amount) {
    System.out.println("Payment: $" + amount);
    balance = balance - amount;
  }

  public void checkBalance() {
    System.out.println("Balance: $" + balance);

  }

  public void showCourses() {
    System.out.println(courses);
  }

  public String toString() {
    return "[NAME: " + name + " ]\n[COURSES: " + courses + "]\nBALANCE: " + balance + " ]";
  }
}
