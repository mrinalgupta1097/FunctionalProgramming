package functionalInterface;

import java.util.function.Function;

public class _Function {
  public static void main(String[] args) {
    //
    /*
    * Function functonal interface takes an input and produces a result.
    * Function<T,R> func;*/

    int increment = increment(0);
    System.out.println(increment);

    int increment1 = incrementByOneFunction.apply(1);
    System.out.println(increment1);
  }

  static int increment(int number){
    return number +1;

  }
//  above increment cam be written as below by using Function
  static Function<Integer,Integer> incrementByOneFunction = number -> number++;

}
