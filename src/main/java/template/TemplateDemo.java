package template;

public class TemplateDemo {
    public static void main(String[] args) {
        ReportTemplate report = FullReport.builder()
                .content("Zawartość")
                .title("Tytuł")
                .header("Nagłówek")
                .footer("Stopka")
                .build();
        ReportTemplate simpleReport = SimpleReport.builder()
                .content("Prosty raport")
                .title("Tytuł prostego raportu")
                .build();
        System.out.println(report.templateMethod());
        System.out.println(simpleReport.templateMethod());

    }
}
