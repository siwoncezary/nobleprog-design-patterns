package tictactoe;

public class TictactoeBoard {
    private static final int SIZE = 3;
    private Symbol[][] board;

    public TictactoeBoard(){
        board = new Symbol[SIZE][SIZE];
        for(Symbol[] row: board){
            row[0] = Symbol.EMPTY;
            row[1] = Symbol.EMPTY;
            row[2] = Symbol.EMPTY;
        }
    }

    private TictactoeBoard(Symbol[][] board){
        this.board = board;
    }

    /**
     *
     * @param input łańcuch o trzech wierszach ze znakami X, O i _
     * XO_\n
     * XXX\n
     * OOO
     * @return
     */
    static public TictactoeBoard parse(String input){
        Symbol[][] board = new Symbol[SIZE][SIZE];
        String[] chars = input.split("\n");
        if (chars.length != SIZE){
            throw new IllegalArgumentException();
        }
        for(String row: chars){
            if (row.length() != SIZE){
                throw new IllegalArgumentException();
            }
        }
        int c = 0;
        int r = 0;
        for(String row: chars){
            for (char item: row.toCharArray()){
                board[r][c] = Symbol.of(item);
            }
        }
        return new TictactoeBoard(board);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                sb.append(board[r][c].get());
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
