package template;

abstract public class ReportTemplate {

    public String templateMethod(){
        return header() + "\n" + title() +"\n" + content() +"\n" + footer();
    }

    abstract String header();

    abstract String title();

    abstract String content();

    abstract String footer();
}
