package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
  public static void main(String[] args) {
    //Plain Java
    System.out.println(getDBConnectionURL());
    //    Using Supplier
    System.out.println(getDBConnectionURLSupplier.get());
  }

  static String getDBConnectionURL() {
    return "jdbc://localhost:5432/users";
  }

  static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/users";
}
