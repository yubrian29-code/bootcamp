public class DemoIf {
  public static void main(String[] args) {
    // if
    int age = 13;

    if (age >= 18) {
      System.out.println("hello");
    }

    // >, <, >=, <=
    if (age >= 18) { // because age is 13, so the result is false, go to else code block
      System.out.println("adult");
    } else {
      System.out.println("child"); // print
    }

    // 8 Primitives + String
    // boolean
    // = (assignment)
    // == (check if equals)
    age = 70;

    if (age > 65) {
      System.out.println("Fee=2");
    }

    boolean isElderly = age > 65; // true
    
    if (isElderly) {
      System.out.println("Fee=2");
    }

    if (isElderly == true) {
      System.out.println("Fee=2");
    }

    // && (AND) || (OR)
    int a = 18;
    // 2 conditions (fulfill at the same time)
    if (a >= 5 && a <= 20) {
      System.out.println("a is between 5 and 20.");
    }
    // Fulfill one of the conditions
    // ! or -> be careful to use else.
    if (a >= 5 || a <= 20) {
      System.out.println("a is either >= 5 or <= 20");
    }

    int b = 10;
    if (a > 20 || b > 12) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }

    // Event 1: a > 20 -> false
    // Event 2: b > 6 && b < 20 -> true
    if (a > 20 || b > 6 && b < 20) {
      System.out.println("correct.");
    }
    
    // double, char, String (Comparsion)
    // String -> methods
    

  }
}