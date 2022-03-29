package chuyashkou.lessonsOOP.computer;

import java.util.Random;
import java.util.Scanner;

public class Computer{

    private String core;

    private  String randomAccessMemory;

    private String hardDiskDrive;

    private static boolean properly;

    private int recource;

    private Random random = new Random();

    private Scanner scanner = new Scanner(System.in);

    public Computer(String core, String randomAccessMemory, String hardDiskDrive) {
        this.core = core;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        recource = random.nextInt(2) + 1;
        properly = true;
    }

    public void description() {
        System.out.println("Computer{" +  "core='" + core + '\'' +
                ", randomAccessMemory='" + randomAccessMemory + '\'' +
                ", hardDiskDrive='" + hardDiskDrive + '\'' +
                ", recource=" + recource +
                '}');
    }

    public void on () {
        if (recource == 0){
            properly = false;
            --this.recource;
            System.out.println("Ресурс исчерпан. Комп сгорел.");
        }else if (properly) {
            System.out.println("Для включения нажмите 0 или 1:");
        }
        if (!properly){
            System.out.println("Комп сгорел.");
        } else if (scanner.nextInt() == random.nextInt(2)){
            System.out.println("Включился.");
            --this.recource;
        } else {
            properly = false;
            System.out.println("Комп сгорел.");
        }
    }

    public void off () {
        if (recource == 0){
            properly = false;
            --this.recource;
            System.out.println("Ресурс исчерпан. Комп сгорел.");
        }else if (properly) {
            System.out.println("Для выключения нажмите 0 или 1:");
        }
        if (!properly){
            System.out.println("Комп сгорел.");
        } else if (scanner.nextInt() == random.nextInt(2)){
            System.out.println("Выключился.");
            --this.recource;
        } else {
            properly = false;
            System.out.println("Комп сгорел.");
        }
    }
}
