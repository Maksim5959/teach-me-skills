package com.chuyashkou.collections.additional_tasks.task2.controller;

import com.chuyashkou.collections.additional_tasks.io.ConsoleReader;
import com.chuyashkou.collections.additional_tasks.task2.service.ProductService;
import com.chuyashkou.collections.additional_tasks.task2.service.impl.ProductServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopController {

    private static final String FORMATTING_REGEX = "[,]";
    private final ProductService service = new ProductServiceImpl();

    public void run() {
        boolean stop = true;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (stop) {
                System.out.println("Выберите действие: ");
                System.out.println("1. Выход");
                System.out.println("2. Вывести все товары");
                System.out.println("3. Добавить новый товар");
                System.out.println("4. Удалить товар");
                System.out.println("5. Редактировать товар");
                String choice = ConsoleReader.read(bufferedReader);

                switch (choice) {
                    case "1" -> stop = false;
                    case "2" -> getAllProducts(bufferedReader);
                    case "3" -> addNewProduct(bufferedReader);
                    case "4" -> deleteProduct(bufferedReader);
                    case "5" -> updateProduct(bufferedReader);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateProduct(BufferedReader bufferedReader) {
        System.out.println("Введите id товара для редактирования, новое наименование и цену через ',' (id, наименование, цена): ");
        service.updateProduct(ConsoleReader.read(bufferedReader).split(FORMATTING_REGEX));
    }

    private void deleteProduct(BufferedReader bufferedReader) {
        System.out.println("Введите id товара: ");
        service.deleteProduct(ConsoleReader.read(bufferedReader));
    }

    private void addNewProduct(BufferedReader bufferedReader) {
        System.out.println("Введите данные нового товара через ',' (id, наименование, цена): ");
        service.addNewProduct(ConsoleReader.read(bufferedReader).split(FORMATTING_REGEX));
    }

    private void getAllProducts(BufferedReader bufferedReader) {
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Выход");
            System.out.println("2. Вывести все товары по цене (возрастание)");
            System.out.println("3. Вывести все товары по цене (убывание)");
            System.out.println("4. Вывести все товары по добовлению (сначала новые)");
            String choice = ConsoleReader.read(bufferedReader);

            switch (choice) {
                case "1" -> {
                    return;
                }
                case "2" -> service.getAllProductsByPriceUp();
                case "3" -> service.getAllProductsByPriceDown();
                case "4" -> service.getAllProductsByAdding();
            }
        }
    }
}
