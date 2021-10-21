package builder;

import java.time.LocalDate;

public class UserDemo {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Karol")
                .birth(LocalDate.of(2000,10,10))
                .email("karolek@op.pl")
                .build();
        System.out.println(person);
        Person adam = Person.builder()
                .name("Karol")
                .birth(LocalDate.of(2000,10,10))
                .email("karolek@op.pl")
                .build();
        System.out.println(person.equals(adam));
    }
}
