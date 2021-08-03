package decorator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailMessage implements Message{
    private String title;
    private String content;
    private String to;
    private String from;

    @Override
    public String title() {
        return title;
    }

    @Override
    public String content() {
        return content;
    }
}
