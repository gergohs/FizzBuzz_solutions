package fizzbuzz;

import java.util.stream.IntStream;

/**
 *
 * @author evoHoGe0
 */
public class FizzBuzz {

    public static void main(String[] args) {

        int rangeMin = 0;
        int rangeMax = 100;

        int[] elements = IntStream.range(rangeMin, rangeMax+1).toArray();

        for (int x : elements) {
            switch (x % 15) {
                case 0:
                    System.out.println("Fuzz-Buzz");
                    break;
                case 5:
                case 10:
                    System.out.println("Buzzz");
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                    System.out.println("Fizzz");
                    break;
                default:
                    System.out.println(x);
                    break;
            }
        }
    }
}
