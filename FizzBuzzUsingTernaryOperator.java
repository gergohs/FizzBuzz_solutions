package fizzbuzzternaryop;

import java.util.stream.IntStream;

public class FizzBuzzUsingTernaryOperator {

    public static void main(String[] args) {

        int[] elements = IntStream.range(1, 101).toArray();
        String res;

        for (int x : elements) {
            System.out.println(res = (x % 3 == 0) ? ((x % 5 == 0) ? "FizzBuzz" : "Buzz") : ((x % 5 == 0) ? "Fizz" : Integer.toString(x)));
        }
    }
}
