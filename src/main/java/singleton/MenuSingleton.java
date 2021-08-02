package singleton;

public class MenuSingleton {
    private static final MenuSingleton instance = new MenuSingleton();

    private MenuSingleton(){
        System.out.println("Singleton created");
    }

    public static MenuSingleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("1. Opcja 1");
        System.out.println("2. Opcja 2");
        System.out.println("3. Koniec");
    }
}
