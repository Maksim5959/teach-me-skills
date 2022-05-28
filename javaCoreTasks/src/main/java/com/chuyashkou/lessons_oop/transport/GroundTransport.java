package com.chuyashkou.lessons_oop.transport;

public abstract class GroundTransport extends Transport {

    private int wheelsCount;
    private int fuelRate;

    public GroundTransport() {
    }

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int wheelsCount, int fuelRate) {
        super(power, maxSpeed, weight, brand);
        this.wheelsCount = wheelsCount;
        this.fuelRate = fuelRate;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(int fuelRate) {
        this.fuelRate = fuelRate;
    }

    @Override
    public String toString() {
        return super.toString() + "GroundTransport{" +
                "wheelsCount=" + wheelsCount +
                ", fuelRate=" + fuelRate + " l*h" +
                '}';
    }
}
