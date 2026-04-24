public class DemoObject {
  public static void main(String[] args) {
    // Top Most Class - Object
    Object o1 = new Object();

    // ! Object is the parent of all Class in Java
    // implicit extends
    Object o2 = new Cat();
    Object o3 = new Superman();
    Object o4 = new Circle(3.5);
  }
}