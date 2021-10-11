package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
  public static void main(String[] args) {
    //
    List<Person> people =
        List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE));

    Function<Person, String> personStringFunction = person -> person.name;
    ToLongFunction<String> length = String::length;
    LongConsumer println = System.out::println;

    //    people.stream()
    //        .map(personStringFunction)
    //        .mapToLong(length)
    //        .forEach(println);

    Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
    boolean containsOnlyFemales = people.stream().anyMatch(personPredicate);
    /*
     * allMatch() : true if all matches the condition.
     * anyMatch() : true if anyone matches the condition.
     * noneMatch() : true if none matches the condition.
     * */

    System.out.println(containsOnlyFemales);

  }

  static class Person {
    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
      this.name = name;
      this.gender = gender;
    }

    @Override
    public String toString() {
      return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
    }
  }

  enum Gender {
    MALE,
    FEMALE
  }
}
