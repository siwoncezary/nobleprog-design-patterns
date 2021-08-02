package prototype;

import lombok.Data;

@Data
public class GameBoard {
    private Field[][] board;

    public GameBoard() {
        this.board = new Field[10][10];
        Field prototypeField = Field.builder()
                .color(100)
                .symbol(' ')
                .build();
        for(int row=0; row < board.length; row++){
            for(int col=0; col < board[row].length; col++){
                //Wykorzystując metodę clone tworzymy kopie obiektu referencyjnego
                board[row][col] = prototypeField.clone();
            }
        }
    }
}
