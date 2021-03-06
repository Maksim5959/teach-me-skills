package com.chuyashkou.lessons_oop.phone;

public class Phone {

    private long number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long number) {
        System.out.println("Звонит " + name + ", номер телефона " + number);
    }

    public void sendMessage(long... numbers) {
        for (long number : numbers) {
            System.out.print(number + " ");
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
