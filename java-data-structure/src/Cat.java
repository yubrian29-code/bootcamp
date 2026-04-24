import java.util.Objects;

public class Cat {
  private String name;
  // + 2 attributes

  // constructor
  public Cat(String name) {
    this.name = name;
  }

  // get
  public String getName() {
    return this.name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Cat))
      return false;
    Cat cat = (Cat) o;
    return this.name.equals(cat.getName());
  }

  // ! HashMap/ HashSet use hashCode & equals
  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Cat(" //
        + "name=" + this.name //
        + ")";
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John");
    System.out.println(c1); // Cat(name=John)
  }

}