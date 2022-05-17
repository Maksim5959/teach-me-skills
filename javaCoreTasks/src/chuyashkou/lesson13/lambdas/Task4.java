package chuyashkou.lesson13.lambdas;

/*4. Лямбда выражение для HeavyBox.
Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение
“Отгрузили ящик с весом n”. “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer
и метод по умолчанию andThen.*/

import chuyashkou.collections.examcloudsTasks.box.HeavyBox;

import java.util.function.Consumer;

public class Task4 {

    public static void main(String[] args) {
        Consumer<HeavyBox> printShipmentInformation = box -> System.out.printf("Отгрузили ящик с весом %.2f.\n", box.getWeight());
        Consumer<HeavyBox> printSendInformation = box -> System.out.printf("Отправляем ящик с весом %.2f.\n", box.getWeight());
        heavyBoXInformation(new HeavyBox(1, 1, 1, 1), printShipmentInformation, printSendInformation);
    }

    private static void heavyBoXInformation(HeavyBox heavyBox, Consumer<HeavyBox> c1, Consumer<HeavyBox> c2) {
        c1.andThen(c2).accept(heavyBox);
    }
}
