package iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>(List.of("ALA", "OLA", "EWA"));
        ListIterator<String> iterator = names.listIterator();
        for(;iterator.hasNext();){
            String name = iterator.next();
            System.out.println(name);
            iterator.set(name.toLowerCase());
        }
        System.out.println(names);
        //przejście po elementach kolekcji od końca
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
