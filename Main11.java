class Base {
  int x;
  Base(int _x) {
    x = _x;
    System.out.println("base class constructor");
  }
}
 
class Derived extends Base {
  int y;
  Derived(int _x, int _y) {
    super(_x);
    y = _y;
  }
  void Display() {
    System.out.println("x = "+x+", y = "+y);
  }
}
 
public class Main11 {
  public static void main(String[] args) {  
    Derived d = new Derived(10, 20);
    d.Display();
  }
}