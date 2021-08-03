package chain_of_responsibility;

/**
 * Handler terminalny, nie wywołuje następnika,
 * powinien być na końcu łańcucha zobowiązań.
 */
public class SpaceHandler implements Handler{
    private final String spaceEqu;
    public SpaceHandler(String spaceEqu) {
        this.spaceEqu = spaceEqu;
    }

    @Override
    public void handle(String request, Response response) {
        if(request.contains("Space")){
            response.setContent(response.getContent().replace(" ", spaceEqu));
        }
    }
}
