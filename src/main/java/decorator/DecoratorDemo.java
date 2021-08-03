package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Message message = new EmailMessage(
                "hello",
                "Hello from email message",
                "sda@sda.pl",
                "zdjavapol100@sda.pl"
        );
        message = new SignedMessage(message, "zdjavapol100");
        message = new HtmlMessageDecorator(message);
        System.out.println("Tytuł: " + message.title());
        System.out.println("Zawartość: " + message.content());
    }
}
