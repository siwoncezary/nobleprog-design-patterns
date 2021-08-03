package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        GameObserver player = (x, y, symbol) -> {
            System.out.println("Zmiana na planszy: " + x+ " " + y + " " + symbol);
        };
        GameObserver spectator = (x, y, symbol) -> {
            System.out.println("Obserwuję zmianę.");
        };

        GameBoard board = new GameBoard();
        board.setOnMoveObserver(player);
        board.setOnMoveObserver(spectator);

        board.makeMove(4, 5, "X");
        board.makeMove(6, 6, "O");
        board.setOnMoveObserver((x, y, s) -> System.out.println("Nowy obserwator"));
        board.makeMove(1,1,"O");
        board.makeMove(1,11,"X");
    }
}
