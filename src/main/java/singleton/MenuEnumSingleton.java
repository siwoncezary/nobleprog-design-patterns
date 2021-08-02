package singleton;

public enum MenuEnumSingleton {
    SINGLETON;

    public static MenuEnumSingleton getInstance(){
        return SINGLETON;
    }

    public void print(){
        System.out.println("1. Opcja 1");
        System.out.println("2. Opcja 2");
        System.out.println("3. Koniec");
    }
}
