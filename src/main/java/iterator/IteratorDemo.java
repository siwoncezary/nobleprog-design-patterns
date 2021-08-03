package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("ALA", "OLA", "ELA"));
        for(Iterator<String> iterator = names.iterator(); iterator.hasNext();){
            //UWAGA!!! next() wywołujemy w pętli tylko raz!
            System.out.println(iterator.next());
            //iterator daje możliwość usuwania elementów podczas przeglądania
            iterator.remove();
        }
        System.out.println(names);
    }
}
