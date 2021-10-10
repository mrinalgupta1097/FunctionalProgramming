package functionalInterface;

import java.util.function.Function;

public class _Function {
  public static void main(String[] args) {
    //
    /*
     * Function functional interface takes an input and produces a result.
     * Function<T,R> func;*/

    int increment = increment(0);
    System.out.println(increment);

    int increment1 = incrementByOneFunction.apply(1);
    System.out.println(increment1);

    System.out.println(
        incrementByOneFunction
            .andThen(multiplyByTen)
            .andThen(squareIt)
            .apply(1)); // function chaining
  }

  static int increment(int number) {
    return number + 1;
  }
  //  above increment cam be written as below by using Function
  static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

  static Function<Integer, Integer> multiplyByTen = number -> number * 10;

  static Function<Integer, Integer> squareIt = number -> number * number;
}
