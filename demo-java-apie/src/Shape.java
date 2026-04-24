public abstract class Shape {
  private Color color;

  // Empty Constructor
  public Shape() {

  }

  // All Args Constructor
  public Shape(Color color) {
    this.color = color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  // public double area() {
  // return -1.0;
  // }

  // ! implicitly public
  abstract double area();

  public static void main(String[] args) {
    Shape s1 = new Circle(3.5);
    System.out.println(s1.area());
    // Dynamic Polymorphism

    // for-each

    // Coding Pattern: Open-Closed (Polymorphism)
    // Shape[] -> 2 Circle 1 Square
    Shape[] shapes = new Shape[] {new Circle(3.5), new Circle(4.5),
        new Square(5.0)};
    // loop -> sum all area
    double sum = 0.0;
    for (Shape shape : shapes) {
      sum += shape.area(); // BigDecimal
      // ! Compile Time: Shape Type -> can call area()
      // ! Runtime: shape -> actual memory object area() content
    }
    System.out.println(sum); // 127.1xxxx

    // what happen if we start to have rectangle

    // ! What is the difference/ same between interface and parent class
    // 1. interface has NO attributes, NO constructor, NO concrete method
    // 2. Parent Class and interface -> Polymorphism (Shape[])
    // 3. Parent Class and interface -> static variable/ method
    // 4. Parent Class (Normal Class (new)/ Abstract Class (cannot new))
    // 5. extends ONE Parent, implements MANY interface
  }
}