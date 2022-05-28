package com.chuyashkou.collections.examclouds_tasks;

/*7. Создать HashMap
Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
Перебрать и распечатать пары значений - entrySet().
Перебрать и распечатать набор из имен продуктов  - keySet().
Перебрать и распечатать значения продуктов - values().
Для каждого перебора создать свой метод.*/

import com.chuyashkou.collections.examclouds_tasks.product.Product;
import com.chuyashkou.collections.examclouds_tasks.product.ProductType;
import com.chuyashkou.collections.examclouds_tasks.product.Toy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task7 {

    public static void main(String[] args) {

        Map<String, Product> toys = createNewProductsHashMap();
        printKeyAndValue(toys);
        printKeyOrValues(toys.keySet());
        printKeyOrValues(toys.values());
    }

    private static Map<String, Product> createNewProductsHashMap() {
        Map<String, Product> toys = new HashMap<>();
        for (int i = 1; i < 11; i++) {
            Toy toy = new Toy(ProductType.TOYS, 100.0 + i, String.format("Toy %d", i));
            toys.put(toy.getName(), toy);
        }
        return toys;
    }

    private static <T, K> void printKeyAndValue(Map<T, K> map) {
        for (Map.Entry<T, K> tkEntry : map.entrySet()) {
            System.out.println(tkEntry);
        }
        System.out.println();
    }

    private static <T> void printKeyOrValues(Collection<T> collection) {
        for (T t : collection) {
            System.out.println(t);
        }
        System.out.println();
    }
}
