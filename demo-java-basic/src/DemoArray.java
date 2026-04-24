import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // int type
    int age = 10;
    int johnAge = 18;
    int maryAge = 17;

    // Array: store a set of same type values
    // Array is an unit in memory
    int[] ages = new int[3];
    // First Box
    ages[0] = age; // Assign 10 into the first box
    // Second Box
    ages[1] = johnAge;
    // Third Box
    ages[2] = maryAge;

    // swap john and mary age (array)
    int temp = ages[1];
    ages[1] = ages[2];
    ages[2] = temp;

    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);

    for (int i = 0; i < ages.length; i++) { // 0,1,2
      System.out.println(ages[i]);
    }
    // System.out.println(ages[0]);
    // System.out.println(ages[1]);
    // System.out.println(ages[2]);

    // System.out.println(ages[-1]); // runtime error
    // System.out.println(ages[3]); // runtime error

    // declare length 100 int array (0-99)
    int[] arr = new int[100]; // default value 0
    // print out all values
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // assign 100 - 199 into the array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 100;
    }

    // Two ways to declare an array (with known value set)
    char[] chs = new char[4];
    // Assignment
    chs[0] = 'a';
    chs[1] = 'b';
    chs[2] = 'c';
    chs[3] = 'd';

    double[] prices = new double[] {99.99, 50.3, 100.0};
    // print out all prices
    for (int i = 0; i < prices.length; i++) {
      System.out.println(prices[i]);
    }
    // sum up all prices
    double totalPrice = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalPrice += prices[i];
    }
    System.out.println("total price=" + totalPrice);
    // find the min value
    double minPrice = prices[0];
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
    }
    // find the max value
    double maxPrice = prices[0];
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] > maxPrice) {
        maxPrice = prices[i];
      }
    }

    // int[], double[], String[], char[]
    char[] chs2 = new char[] {'a', 'e', 'i', 'o', 'u'};
    String name = "Mary";
    // loop: Check the name if it contains the char value in chs2
    boolean found = false;
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) == chs2[0] || name.charAt(i) == chs2[1]
          || name.charAt(i) == chs2[2] || name.charAt(i) == chs2[3]
          || name.charAt(i) == chs2[4]) {
        found = true;
        break; // break loop
      }
    }
    System.out.println(found); // true

    // outer loop and inner loop
    found = false;
    for (int i = 0; i < name.length(); i++) { // outer loop (every char in the name)
      for (int j = 0; j < chs2.length; j++) { // inner loop (every char in the chs2)
        if (name.charAt(i) == chs2[j]) {
          found = true;
          break; // break inner loop
        }
      }
      if (found) {
        break; // break outer loop
      }
    }
    System.out.println(found); // true

    //
    int[] arr2 = new int[] {100, 4, 99, 55, 17};
    // move the first number to the tail -> 4, 99, 55, 17, 100
    // swap
    for (int i = 0; i < arr2.length - 1; i++) {
      int backup = arr2[i];
      arr2[i] = arr2[i + 1];
      arr2[i + 1] = backup;
    }
    // 100, 4, 99, 55, 17
    // 4, 100, 99, 55, 17
    // 4, 99, 100, 55, 17
    // 4, 99, 55, 100, 17
    // 4, 99, 55, 17, 100
    System.out.println(Arrays.toString(arr2)); // [4, 99, 55, 17, 100]

    int[] arr3 = new int[] {100, 4, 200, 55, 17};
    // Move the max number to the tail [x, x, x, x, 200]
    for (int i = 0; i < arr2.length - 1; i++) {
      if (arr3[i] > arr3[i + 1]) {
        int backup = arr3[i];
        arr3[i] = arr3[i + 1];
        arr3[i + 1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr3)); // 4, 100, 55, 17, 200

    // Sorting
    // 4, 55, 17, 100, 200
    int[] arr4 = new int[] {100, 4, 200, 55, 17};
    for (int i = 0; i < arr2.length - 1; i++) { // 0,1,2,3 (How many times you move the max number)
      for (int j = 0; j < arr2.length - 1 - i; j++) { // (How many moves you need for max number)
        if (arr4[j] > arr4[j + 1]) {
          int backup = arr4[j];
          arr4[j] = arr4[j + 1];
          arr4[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(arr4));

    String str = "abcdefg";
    // reverse the string
    // gfedcba
    String reversedString = "";
    for (int i = 0; i < str.length(); i++) {
      reversedString += str.charAt(str.length() - 1 - i); // ! 
    }
    System.out.println("reversed=" + reversedString);

  }
}