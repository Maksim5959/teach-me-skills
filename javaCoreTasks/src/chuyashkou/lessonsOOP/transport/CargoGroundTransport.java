package chuyashkou.lessonsOOP.transport;

public class CargoGroundTransport extends GroundTransport {

    private int capacity;

    public CargoGroundTransport() {
    }

    public CargoGroundTransport(int power, int maxSpeed, int weight, String brand, int wheelsCount, int fuelRate, int capacity) {
        super(power, maxSpeed, weight, brand, wheelsCount, fuelRate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void checkCapacity(int weight) {
        if (weight > this.capacity) {
            System.out.println("Нужен грузовик побольше!");
        } else {
            System.out.println("Грузовик загружен!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CargoGroundTransport{" +
                "capacity=" + capacity + " t" +
                '}';
    }
}
