package chuyashkou.lessonsOOP.computer;

public class ComputerApp {

    public static void main(String[] args) {

        Computer computer = new Computer("Core i7", "8 gb", "1 tb");
        computer.description();

        for (int i = 0; i < 10; i++) {
            computer.on();
            computer.off();
        }
    }
}
