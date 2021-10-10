package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Person> people =
        List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Aisha", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("ALice", Gender.FEMALE));

    System.out.println("//    Imperative Approach");

    List<Person> females = new ArrayList<>();
    for (Person person : people) {
      if (Gender.FEMALE.equals(person.gender)) {
        females.add(person);
      }
    }
    for (Person female : females) {
      System.out.println(female);
    }
    System.out.println("//    Declarative approach");

    people.stream()
        .filter(person -> Gender.FEMALE.equals(person.gender))
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

  public static class Person {
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
