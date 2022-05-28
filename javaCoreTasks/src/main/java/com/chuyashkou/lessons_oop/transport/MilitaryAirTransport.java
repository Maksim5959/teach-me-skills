package com.chuyashkou.lessons_oop.transport;

public class MilitaryAirTransport extends AirTransport {

    private int rocketsCount;
    private boolean catapult;

    public MilitaryAirTransport() {
    }

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int runwayLength, int rocketsCount, boolean сatapult) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.rocketsCount = rocketsCount;
        this.catapult = сatapult;
    }

    public int getRocketsCount() {
        return rocketsCount;
    }

    public void setRocketsCount(int rocketsCount) {
        this.rocketsCount = rocketsCount;
    }

    public boolean getCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public void shot() {
        if (this.rocketsCount > 0) {
            System.out.println("Ракета пошла.");
            this.rocketsCount--;
        } else {
            System.out.println("Боеприпасы отсуствуют.");
        }
    }

    public void ejection() {
        if (catapult) {
            System.out.println("Катапультируюсь");
            this.catapult = false;
        } else {
            System.out.println("Нет такой системы.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "MilitaryAirTransport{" +
                "rocketsCount=" + rocketsCount +
                ", catapult=" + catapult +
                '}';
    }
}
