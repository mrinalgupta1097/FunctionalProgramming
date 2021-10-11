package combinatorPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private LocalDate dob;
}
