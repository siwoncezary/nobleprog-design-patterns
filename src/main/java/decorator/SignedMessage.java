package decorator;


public class SignedMessage implements Message{
    //pole obiektu dekorowanego
    private final Message message;
    private final String sign;

    public SignedMessage(Message message, String sign) {
        this.message = message;
        this.sign = sign;
    }

    @Override
    public String title() {
        return message.title();
    }

    @Override
    public String content() {
        return message.content() + "\n" + sign;
    }
}
