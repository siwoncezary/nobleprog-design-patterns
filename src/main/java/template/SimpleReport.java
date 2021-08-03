package template;

import lombok.Builder;

@Builder
public class SimpleReport extends ReportTemplate{
    private String title;
    private String content;
    @Override
    String header() {
        return "";
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
        return "";
    }
}
