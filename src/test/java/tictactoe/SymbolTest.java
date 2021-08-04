package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolTest {

    @Test
    public void shouldReturnSymbolXForCharacterX(){
        //given
        char symbolChar = 'X';
        //when
        Symbol test = Symbol.of(symbolChar);
        //that
        assertEquals(Symbol.X, test);
    }

    @Test
    public void shouldReturnSymbolOForCharacterO(){
        //given
        char symbolChar = 'O';
        //when
        Symbol test = Symbol.of(symbolChar);
        //that
        assertEquals(Symbol.O, test);
    }

    @Test
    public void shouldThrowExceptionForInvalidCharacter(){
        //given
        char symbolChar = 'H';
        //when and that
        assertThrows(IllegalArgumentException.class, () -> Symbol.of(symbolChar));
    }
}