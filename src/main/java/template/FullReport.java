package template;

import lombok.Builder;

@Builder
public class FullReport extends ReportTemplate{
    private String header;
    private String title;
    private String content;
    private String footer;
    @Override
    String header() {
        return header + "\n" + "*".repeat(header.length());
    }

    @Override
    String title() {
        return title;
    }

    @Override
    String content() {
        return content;
    }

    @Override
    String footer() {
        return footer;
    }
}
