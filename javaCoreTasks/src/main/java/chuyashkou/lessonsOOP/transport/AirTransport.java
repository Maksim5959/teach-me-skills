package chuyashkou.lessonsOOP.transport;

public abstract class AirTransport extends Transport {

    private int wingspan;
    private int runwayLength;

    public AirTransport() {
    }

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int runwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    @Override
    public String toString() {
        return super.toString() + "AirTransport{" +
                "wingspan=" + wingspan + " m" +
                ", runwayLength=" + runwayLength + " km" +
                '}';
    }
}
