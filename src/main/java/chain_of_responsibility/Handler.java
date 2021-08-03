package chain_of_responsibility;

public interface Handler {
    void handle(String request, Response response);
}
