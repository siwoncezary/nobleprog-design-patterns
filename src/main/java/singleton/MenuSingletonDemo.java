package singleton;

public class MenuSingletonDemo {
    public static void main(String[] args) {
        System.out.println("Przed pobraniem instancji singletona");
        MenuSingleton menu = MenuSingleton.getInstance();
        menu.print();
        //każde wywołanie getInstance ma zwrócić ten sam obiekt
        //warunek musi być true
        System.out.println(menu==MenuSingleton.getInstance());

        //Przykład singletona typu enum
        MenuEnumSingleton enumMenu = MenuEnumSingleton.getInstance();
        enumMenu.print();
    }
}
