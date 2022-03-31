package chuyashkou.lessonsOOP.music;

import chuyashkou.lessonsOOP.music.instruments.Drum;
import chuyashkou.lessonsOOP.music.instruments.Guitar;
import chuyashkou.lessonsOOP.music.instruments.Horn;
import chuyashkou.lessonsOOP.music.instruments.Instrument;

public class InstrumentsApp {

    public static void main(String[] args) {

        Instrument guitar = new Guitar(6);
        Instrument drum = new Drum(15);
        Instrument horn = new Horn(2);

        Instrument[] instruments = {guitar, drum, horn};

        for (Instrument instrument : instruments) {
            instrument.play();
            System.out.println(instrument.KEY);
        }
    }
}
