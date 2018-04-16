package labs;

import java.io.*;

public class PasswordApp {

  public static void main(String[] args) throws LetterCriteriaException {
    // Read the file
    // Verify that the password contains all of the following criteria:
        // A number
        // A letter
        // Special character (! @ #)
    // Create three User Defined Exceptions for the corresponding criteria.
    // If the password does not meet the criteria, create and throw the appropriate exception
    String filename = "/Users/jzilch/Desktop/Web Projects/Java/JavaTraining/src/labs/passwords.txt";
    String[] pwds = new String[13];

    File file = new File(filename);
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      for (int p = 0; p < pwds.length; p++) {
        pwds[p] = br.readLine();
      }
    } catch (FileNotFoundException e) { System.out.println("ERROR: File not found");
    } catch (IOException e) { System.out.println("ERROR: Could not read file"); }

    for (String pwd : pwds) {
      System.out.println(pwd);
      boolean hasNumber = false;
      boolean hasLetter = false;
      boolean hasSpecialCharacter = false;
      boolean hasInvalidCharacter = false;

      for (int n = 0; n < pwd.length(); n++) {
        // Condition 1: contains number
        if ("0123456789".contains(pwd.substring(n, n+1))) {
          hasNumber = true;
          // System.out.println("Position " + n + " contains a number");
        }
        // Condition 2: contains letter
        else if ("abcdefghijklmnopqrstuvwxyz".contains(pwd.substring(n, n+1).toLowerCase())) {
          hasLetter = true;
          // System.out.println("Position " + n + " contains a letter");
        }
        // Condition 3: contains special character
        else if ("!@#".contains(pwd.substring(n, n+1))) {
          hasSpecialCharacter = true;
          // System.out.println("Position " + n + " contains a special character");
        }
        else {
          try { throw new InvalidCharacterException(pwd.substring(n,n+1));
          } catch (InvalidCharacterException e) { e.toString(); }
        }

      }
      // Test and exception handling
      try {
        if (!hasNumber) { throw new NumberCriteriaException(pwd); }
        else if (!hasLetter) { throw new LetterCriteriaException(pwd); }
        else if (!hasSpecialCharacter) { throw new SpecialCharacterCriteriaException(pwd); }
        else { System.out.println("Valid Password"); }
      } catch (NumberCriteriaException | LetterCriteriaException | SpecialCharacterCriteriaException e) {
        System.out.println("Invalid password");
        System.out.println(e.toString());
      }
    }
  }

}

class InvalidCharacterException extends Exception {
  String ch;
  public InvalidCharacterException(String ch) {
    this.ch = ch;
  }
  public String toString() {
    return "InvalidCharacterException: " + ch;
  }
}

class NumberCriteriaException extends Exception {
  String pwd;
  public NumberCriteriaException(String pwd) {
    this.pwd = pwd;
  }
  public String toString() {
    return "NumberCriteriaException: " + pwd;
  }
}

class LetterCriteriaException extends Exception {
  String pwd;
  public LetterCriteriaException(String pwd) {
    this.pwd = pwd;
  }
  public String toString() {
    return "LetterCriteriaException: " + pwd;
  }
}

class SpecialCharacterCriteriaException extends Exception {
  String pwd;
  public SpecialCharacterCriteriaException(String pwd) {
    this.pwd = pwd;
  }
  public String toString() {
    return "SpecialCharacterCriteriaException: " + pwd;
  }
}

