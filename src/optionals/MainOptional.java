package optionals;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainOptional {
  public static void main(String[] args) {
    //
    Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
    Object value = Optional.ofNullable("Hello").orElseThrow(exception);

    Optional.ofNullable("Hello Optional").ifPresent(System.out::println);

    Consumer<Object> stringConsumer = email -> System.out.println("Sending email to : " + email);
    Optional.ofNullable(null).ifPresentOrElse(stringConsumer, () -> run());
    System.out.println(value);
  }

  private static void run() {
    System.out.println("cannot send email");
  }
}
