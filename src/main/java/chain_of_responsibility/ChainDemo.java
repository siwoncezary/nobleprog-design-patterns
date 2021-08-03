package chain_of_responsibility;

public class ChainDemo {
    public static void main(String[] args) {
        Handler terminalHandler = new SpaceHandler("_");
        Handler firstHandler = new UpperCaseHandler(terminalHandler);
        String request = "UpperCase;Space";
        Response response = new Response("Java jest cool");
        //wpuszczamy żądanie i odpowiedź do łańcucha zobowiązań
        firstHandler.handle(request, response);
        System.out.println(response.getContent());
    }
}
