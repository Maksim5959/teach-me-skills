package com.chuyashkou.collections.w3resource_tasks.arrayList;

//2. Write a Java program to iterate through all elements in a array list.

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Task2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = Task1.class.getDeclaredMethod("createColorList");
        method.setAccessible(true);
        List<String> colors = (List<String>) method.invoke(null);

        System.out.println(colors);
        colors.forEach(System.out::println);
        for (String color : colors) {
            System.out.print(String.format("%s ", color));
        }
    }
}
