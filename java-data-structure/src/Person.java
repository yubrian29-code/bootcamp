public class Person implements Comparable<Person> {
  private int age;

  public Person(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  // ! Compare Two Person, return 1 Person
  // return int
  // -1 -> return this
  // 1 -> return person
  @Override
  public int compareTo(Person person) {
    return this.age > person.getAge() ? -1 : 1;
  }

  // equals, hashCode, toString
  @Override
  public String toString() {
    return "Person(" //
        + "age=" + this.age //
        + ")";
  }
}