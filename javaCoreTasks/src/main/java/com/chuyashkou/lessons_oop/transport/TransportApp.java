package com.chuyashkou.lessons_oop.transport;

public class TransportApp {

    public static void main(String[] args) {

        CivilianAirTransport boeing = new CivilianAirTransport(655, 1000, 5, "Boeing", 50, 3, 200, true);
        PassengerGroundTransport audi = new PassengerGroundTransport(200, 350, 1, "Audi", 4, 10, 4, "Sedan");
        CargoGroundTransport scania = new CargoGroundTransport(500, 120, 15, "Scania", 12, 20, 20);
        MilitaryAirTransport mig = new MilitaryAirTransport(655, 1000, 5, "Boeing", 50, 3, 1, true);

        audi.distance(10);
        scania.checkCapacity(20);
        boeing.checkPassengerCount(50);
        mig.shot();
        mig.shot();
        mig.ejection();
        mig.ejection();
    }
}
