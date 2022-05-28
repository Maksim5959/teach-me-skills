package com.chuyashkou.lessons_oop.transport;

public class PassengerGroundTransport extends GroundTransport {

    private int passengerCount;
    private String type;

    public PassengerGroundTransport() {
    }

    public PassengerGroundTransport(int power, int maxSpeed, int weight, String brand, int wheelsCount, int fuelRate, int passengerCount, String type) {
        super(power, maxSpeed, weight, brand, wheelsCount, fuelRate);
        this.passengerCount = passengerCount;
        this.type = type;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void distance(double hours) {
        System.out.println("Автомобиль " + super.getBrand() + " за " + hours + " часа(ов) " + ", двигаясь с максимальной скоростью " + super.getMaxSpeed() + " км/ч " + ", проедет " +
                super.getMaxSpeed() * hours + " километров и затратит " + fuelRate(hours) + " литров топлива.");
    }

    private double fuelRate(double hours) {
        return super.getFuelRate() * hours;
    }

    @Override
    public String toString() {
        return super.toString() + "PassengerGroundTransport{" +
                "passengerCount=" + passengerCount +
                ", type=" + type +
                '}';
    }
}
