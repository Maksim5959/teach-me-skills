package chuyashkou.lessonsOOP.music.instruments;

public class Guitar implements Instrument {

    private int stringCount;

    public Guitar() {
    }

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, количество струн: " + this.stringCount);
    }
}
