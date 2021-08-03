package decorator;

public class HtmlMessageDecorator implements Message {
    private final Message message;

    public HtmlMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String title() {
        return "<h1>" + message.title() + "</h1>";
    }

    @Override
    public String content() {
        return "<p>" + message.content() + "</p>";
    }
}
