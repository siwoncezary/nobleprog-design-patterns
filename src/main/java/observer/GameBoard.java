package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Plansza gry 10 x 10
 */
public class GameBoard {
    private List<GameObserver> observers = new ArrayList<>();

    public void setOnMoveObserver(GameObserver observer){
        observers.add(observer);
    }

    private void notifyObservers(int col, int row, String player){
        for(GameObserver observer: observers){
            observer.update(row, col, player);
        }
    }

    public void makeMove(int col, int row, String player){
        //jeśli ruch poprawny to wykonujemy i informujemy obserwatorów
        if(col>=0 && col < 10 && row>=0 && row < 10){
            notifyObservers(row, col, player);
        }
    }
}
