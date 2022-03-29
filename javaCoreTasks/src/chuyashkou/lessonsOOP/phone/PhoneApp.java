package chuyashkou.lessonsOOP.phone;

public class PhoneApp {

    public static void main(String[] args) {

        Phone samsung = new Phone(375293332255L, "Samsung", 300);
        Phone honor = new Phone(375294442255L, "Honor", 325);
        Phone huawey = new Phone(375292532255L, "Huawey", 150);

        System.out.println(samsung);
        System.out.println(honor);
        System.out.println(huawey);

        samsung.receiveCall("Ivan");
        honor.receiveCall("Vasily");
        huawey.receiveCall("Konstantin");

        System.out.println(samsung.getNumber());
        System.out.println(honor.getNumber());
        System.out.println(huawey.getNumber());

        samsung.receiveCall("Ivan", 375293332255L);

        samsung.sendMessage(375293332255L, 375293342255L, 375293802255L, 375299032255L, 375291532255L);
    }
}
