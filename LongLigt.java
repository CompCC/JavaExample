public class LongLigt {
  public static void main(String[] args) {
    int lidhtspeed;
    long days;
    long seconds;
    long distanse;
    lidhtspeed = 186000; // приблизительная скорость света в милях
    days = 1000; //кол-во дней
    seconds = days * 24 * 60 * 60; //преобразовать время в секуды
    distanse = lidhtspeed * seconds; //расчитать расстояние
    System.out.println("За " + days + " дней свет пройдет около " + distanse + " миль");
  }
}
