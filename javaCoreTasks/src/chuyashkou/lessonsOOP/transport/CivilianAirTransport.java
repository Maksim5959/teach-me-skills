package chuyashkou.lessonsOOP.transport;

public class CivilianAirTransport extends AirTransport {

    private int passengerCount;
    private boolean businessClass;

    public CivilianAirTransport() {
    }

    public CivilianAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int runwayLength, int passengerCount, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.passengerCount = passengerCount;
        this.businessClass = businessClass;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void checkPassengerCount(int passengerCount) {
        if (passengerCount > this.passengerCount) {
            System.out.println("Нужен самолет побольше!");
        } else {
            System.out.println("К вылету готов!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CivilianAirTransport{" +
                "passengerCount=" + passengerCount +
                ", businessClass=" + businessClass +
                '}';
    }
}
