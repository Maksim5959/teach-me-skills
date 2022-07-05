package com.chuyashkou.multithreading.restaurant.model;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class Restaurant {

    private final int totalNumberOfGuests = 30;
    private final int totalNumberOfTables = 10;
    private int reservedTables;
    private int money = 0;
    private int servedTablesCounter = 0;

    public Restaurant(int reservedTables) {
        if (reservedTables <= totalNumberOfTables) {
            this.reservedTables = reservedTables;
        } else {
            throw new RuntimeException(String.format("Invalid number of reserved tables. Total number of tables = %d, reserved = %d"
                    , this.totalNumberOfTables, reservedTables));
        }
    }

    @SneakyThrows
    public synchronized void reserveTable() {
        while ((reservedTables > 7 || money == 1000) && servedTablesCounter != totalNumberOfGuests) {
            wait();
        }
        if (servedTablesCounter != totalNumberOfGuests) {
            reservedTables++;
            System.out.printf("Table has reserved by %s,the number of free tables - %d\n", Thread.currentThread().getName()
                    , totalNumberOfTables - reservedTables);
            Thread.sleep(100);
            notifyAll();
        } else {
            Thread.currentThread().interrupt();
        }
    }

    @SneakyThrows
    public synchronized void releaseTable() {
        while ((reservedTables < 3 || money == 1000) && servedTablesCounter != totalNumberOfGuests) {
            wait();
        }
        if (servedTablesCounter != totalNumberOfGuests) {
            servedTablesCounter++;
            this.cleanTheTable();
            notifyAll();
        } else {
            while (reservedTables > 0) {
                this.cleanTheTable();
            }
            notifyAll();
            Thread.currentThread().interrupt();
        }
    }

    @SneakyThrows
    public synchronized void collect() {
        while (money < 1000 && servedTablesCounter != totalNumberOfGuests) {
            wait();
        }
        if (servedTablesCounter != totalNumberOfGuests) {
            this.getAllMoney();
            System.out.println("No money");
            notifyAll();
        } else {
            if (reservedTables != 0) wait();
            this.getAllMoney();
            System.out.println("Restaurant is closed");
            Thread.currentThread().interrupt();
        }
    }

    @SneakyThrows
    private void getAllMoney() {
        System.out.println("Encashment:");
        Thread.sleep(1000);
        while (money > 0) {
            money -= 50;
            System.out.printf("money = %d\n", money);
            Thread.sleep(100);
        }
        Thread.sleep(2000);
    }

    @SneakyThrows
    private void cleanTheTable() {
        reservedTables--;
        money += 50;
        System.out.printf("Waiter %s has cleaned one table, the number of free tables - %d, money = %d\n",
                Thread.currentThread().getName(), totalNumberOfTables - reservedTables, this.money);
        Thread.sleep(100);
    }
}
