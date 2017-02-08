/**
 * Brute force solution to euler project's
 * <a href="http://projecteuler.net/index.php?section=problems&id=1">problem 1</a>.
 * @author <a href="mailto:gv0tch0@gmail.com">Nik Kolev</a>
 */
public class P1 {

  public static void main(String[] args) throws Exception {
    long cutoff = 1000L;
    if (args.length >= 1) {
      cutoff = Long.valueOf(args[0]).longValue();
    }
    long sum = 0;
    for(long i = 0; i < cutoff; i++) {
      if (((i % 3) == 0) || ((i % 5) == 0)) {
        sum += i;
      }
    }
    System.out.println(
        "The sum of all the multiples of 3 or 5 below " + cutoff + " is " + sum + ".");
  }

}
