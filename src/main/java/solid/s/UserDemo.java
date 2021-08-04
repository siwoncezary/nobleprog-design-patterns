package solid.s;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("aa@op.pl");
        System.out.println(user.topDomain());
        SolidUser solidUser = SolidUser.builder()
                .email(new Email("aa@op.pl"))
                .nick("ala")
                .build();
        System.out.println(solidUser.getEmail().topDomain());
        System.out.println(solidUser.getEmail());
    }
}
