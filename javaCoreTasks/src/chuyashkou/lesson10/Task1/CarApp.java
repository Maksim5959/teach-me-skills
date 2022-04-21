package chuyashkou.lesson10.Task1;

public class CarApp {

    public static void main(String[] args) {

        Car audi = new Car("audi", 300, 15880.60);
        Car mercedes = new Car("mercedes", 400, 20220.80);
        Car lada = new Car("lada", 120, 5550.60);

        Car[] cars = {audi, mercedes, lada};

        for (Car car : cars) {
            try {
                car.start();
            } catch (CarException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
    }
}
