package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
  public static void main(String[] args) {
    //    Plain Java
    System.out.println(isPhoneNUmberValid("07000000000"));
    System.out.println(isPhoneNUmberValid("09000000000"));
    //    Predicate Style - single argument boolean valued function
    System.out.println("Predicate Demo : " + isPhoneNumberValidPredicate.test("07000000000"));
  }
  // Plain Java Style
  static boolean isPhoneNUmberValid(String phoneNumber) {
    return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
  }

  //  Predicate Style
  static Predicate<String> isPhoneNumberValidPredicate =
      phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}
