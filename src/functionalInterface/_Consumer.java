package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
  public static void main(String[] args) {
    // Java Way
    System.out.println("..........using plain java.............");
    Customer maria = new Customer("Maria", "99999");
    greetCustomer(maria);

//    Using Consumer
    System.out.println("..........using consumer functional interface............");

    greetCustomerConsumer.accept(maria);
  }



  static class Customer {
    private final String customerName;
    private final String customerPhoneNumber;

    public Customer(String customerName, String customerPhoneNumber) {
      this.customerName = customerName;
      this.customerPhoneNumber = customerPhoneNumber;
    }


  }
//  Java way
  static void greetCustomer(Customer customer) {
    System.out.println(
            "Hello "
                    + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);
  }
  //    Consumer Way
  static Consumer<Customer> greetCustomerConsumer =
          customer ->
                  System.out.println(
                          "Hello "
                                  + customer.customerName
                                  + ", thanks for registering phone number "
                                  + customer.customerPhoneNumber);
}
