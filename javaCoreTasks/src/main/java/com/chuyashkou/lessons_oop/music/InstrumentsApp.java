package com.chuyashkou.lessons_oop.music;

import com.chuyashkou.lessons_oop.music.instruments.Drum;
import com.chuyashkou.lessons_oop.music.instruments.Guitar;
import com.chuyashkou.lessons_oop.music.instruments.Horn;
import com.chuyashkou.lessons_oop.music.instruments.Instrument;

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
