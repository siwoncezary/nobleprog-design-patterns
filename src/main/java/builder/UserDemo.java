package builder;

import java.time.LocalDate;

public class UserDemo {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Karol")
                .birth(LocalDate.of(2000,10,10))
                .email("karolek@op.pl")
                .build();
        System.out.println(user);
        User adam = User.builder()
                .name("Karol")
                .birth(LocalDate.of(2000,10,10))
                .email("karolek@op.pl")
                .build();
        System.out.println(user.equals(adam));
    }
}
