public class P2 {

  public static void main(String[] args) {
    System.out.println(sumOfEvenFibs(Long.valueOf(args[0])));
  }

  public static long sumOfEvenFibs(Long notGreaterThan) {
    long result = 0;
    long one = 1;
    long two = 1;
    long next = one + two;
    while (next < notGreaterThan) {
      if (next % 2 == 0) {
        result += next;
      }
      one = two;
      two = next;
      next = one + two;
    }
    return result;
  }

}

