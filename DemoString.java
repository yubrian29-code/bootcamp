public class DemoString {
  public static void main(String[] args) {

    // ! String is not Primitive, but a class
    // Class has method

    // Print String value
    System.out.println("hello");

    // "" ->  define String value
    // String value can be any length
    String s1 = "h";
    char c1 = 'h';

    // String support + operation (append)
    s1 = s1 + "!!!";
    System.out.println(s1); // h!!!

    // String has methods (function)
    // 1. length() -> return int
    System.out.println(s1.length()); // 4
    System.out.println(s1); // h!!!

    // 2. charAt() -> return char
    String s2 = "hello";
    // Find the third character in s2

    // Java index: start with 0 -> length - 1
    // "hello" -> 0 (h), 4 (o)
    System.out.println(s2.charAt(2)); // l

    // Find the last character of s2
    // length(), charAt()

    // length() -> int value
    // int value - 1 -> int value
    System.out.println(s2.charAt(s2.length() - 1));

    int stringLength = s2.length();
    int lastIndex = stringLength - 1;
    System.out.println(s2.charAt(lastIndex));

    // 3. eqauls() -> return boolean
    String s3 = "hello";
    System.out.println(s2.equals(s3)); // true

    String s4 = "Hello";
    System.out.println(s2.equals(s4)); // false

    
  }
}