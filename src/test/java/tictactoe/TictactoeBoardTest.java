package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TictactoeBoardTest {

    @Test
    public void shouldReturnValidBoardForValidString(){
        //given
        String input = "OO_\nX__\nXO_\n";
        //when
        TictactoeBoard board = TictactoeBoard.parse(input);
        //that
        assertNotNull(board);
        assertEquals(input, board.toString());
    }

}