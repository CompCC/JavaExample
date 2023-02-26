public class IfSample {
  public static void main(String[] args) {
    int x, y;
    x = 10;
    y = 20;
    if (x < y) {
      System.out.println("Значение Х меньше Y");
    }
    x = x * 2;
    if (x == y)
      System.out.println("Теперь значение Х равно значению Y");
    x = x * 2;
    if (x > y) {
      System.out.println("Теперь значение x больше значения y");
    }
    if (x == y)
      System.out.println("Это сообщение выводиться не будет");
  }
}
