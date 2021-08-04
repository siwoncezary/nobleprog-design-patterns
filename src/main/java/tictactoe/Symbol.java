package tictactoe;

public enum Symbol {
    EMPTY('_'), X('X'), O('O');
    private final char symbolChar;
    Symbol(char symbolChar){
        this.symbolChar = symbolChar;
    }

    public static Symbol of(char symbolChar){
        for(Symbol s: Symbol.values()){
            if (s.symbolChar == symbolChar){
                return s;
            }
        }
        throw  new IllegalArgumentException();
    }

    public char get(){
        return symbolChar;
    }
}
