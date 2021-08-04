package solid.d;

public class DriverDemo {
    public static void main(String[] args) {
        //ten obiekt sam tworzy pole kierowcy i skazany jest na tę samą klasę
        Car car = new Car();
        //w tej klasie mamy wybór obiektu kierowcy
        //możemy zdefiniować klasę pochodną po Driver i ją wykorzystać
        //w klasie DependencyCar
        DependencyCar dependencyCar = new DependencyCar(new Driver());


    }
}
