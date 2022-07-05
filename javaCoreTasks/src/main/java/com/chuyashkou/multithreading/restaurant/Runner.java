package com.chuyashkou.multithreading.restaurant;

/*К задаче на уроке:
Добавить кассу и считать по 50р. за каждый столик.
Когда наберется 1000, приезжает инкассация, идет процесс примерно 5 сек,
в этот момент нельзя букать столики.
Касса обнуляется и продолжается работа.
- Когда будет обслужено 100 столиков завершается работа ресторана.*/

import com.chuyashkou.multithreading.restaurant.model.Encashment;
import com.chuyashkou.multithreading.restaurant.model.Guest;
import com.chuyashkou.multithreading.restaurant.model.Restaurant;
import com.chuyashkou.multithreading.restaurant.model.Waiter;
import lombok.SneakyThrows;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant(2);

        Thread encashment = new Thread(new Encashment(restaurant));
        encashment.start();

        for (int i = 0; i < 50; i++) {
            Thread guest = new Thread(new Guest(restaurant));
            guest.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread waiter = new Thread(new Waiter(restaurant));
            waiter.start();
        }
    }
}
