package solid.i;
/*
Interfejs jest zbyt szeroki dla wielu klas
nadaje się tylko dla kopiarek.
 */
public interface Copier {
    void powerOn();
    void powerOff();
    void copy(int copiesNumber);
    void print();
    void scan();
}
