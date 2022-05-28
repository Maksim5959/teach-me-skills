package com.chuyashkou.lessons_oop.computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String core;
    private String randomAccessMemory;
    private String hardDiskDrive;
    private static boolean properly;
    private int resource;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public Computer() {
    }

    public Computer(String core, String randomAccessMemory, String hardDiskDrive) {
        this.core = core;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        resource = random.nextInt(2) + 1;
        properly = true;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(String randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public String getHardDiskDrive() {
        return hardDiskDrive;
    }

    public void setHardDiskDrive(String hardDiskDrive) {
        this.hardDiskDrive = hardDiskDrive;
    }

    public static boolean isProperly() {
        return properly;
    }

    public static void setProperly(boolean properly) {
        Computer.properly = properly;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void description() {
        System.out.println("Computer{" + "core='" + core + '\'' +
                ", randomAccessMemory='" + randomAccessMemory + '\'' +
                ", hardDiskDrive='" + hardDiskDrive + '\'' +
                ", resource=" + resource +
                '}');
    }

    public void on() {
        if (resource == 0) {
            properly = false;
            --this.resource;
            System.out.println("Ресурс исчерпан. Комп сгорел.");
        } else if (properly) {
            System.out.println("Для включения нажмите 0 или 1:");
        }
        if (!properly) {
            System.out.println("Комп сгорел.");
        } else if (scanner.nextInt() == random.nextInt(2)) {
            System.out.println("Включился.");
            --this.resource;
        } else {
            properly = false;
            System.out.println("Комп сгорел.");
        }
    }

    public void off() {
        if (resource == 0) {
            properly = false;
            --this.resource;
            System.out.println("Ресурс исчерпан. Комп сгорел.");
        } else if (properly) {
            System.out.println("Для выключения нажмите 0 или 1:");
        }
        if (!properly) {
            System.out.println("Комп сгорел.");
        } else if (scanner.nextInt() == random.nextInt(2)) {
            System.out.println("Выключился.");
            --this.resource;
        } else {
            properly = false;
            System.out.println("Комп сгорел.");
        }
    }
}
