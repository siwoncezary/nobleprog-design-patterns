package chain_of_responsibility;

public class UpperCaseHandler implements Handler{
    private final Handler successor;

    public UpperCaseHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handle(String request, Response response) {
        if (request.contains("UpperCase")){
            response.setContent(response.getContent().toUpperCase());
        }
        successor.handle(request, response);
    }
}
