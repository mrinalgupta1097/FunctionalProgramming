package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
  public static void main(String[] args) {
    //
    Customer customer =
        new Customer("ALice",
                "alice@gmail.com",
                "+919634431374",
                LocalDate.of(2000, 1, 1));
    System.out.println(new CustomerValidatorService().isValid(customer));
//    using combinator pattern
    ValidationResult result = isEmailValid()
            .and(isPhoneNumberValid())
            .and(isAnAdult())
            .apply(customer);
    System.out.println(result);
  }
}
