package chuyashkou.streamApi.tms;

/*Условие: Дана коллекция чисел Arrays.asList(1, 2, 3, 4), рассмотрим работу collect и toArray с ней
Получить сумму нечетных чисел - 4
Вычесть от каждого элемента 1 и получить среднее - 1.5
Прибавить к числам 3 и получить статистику - 	IntSummaryStatistics{count=4, sum=22, min=4, average=5.5, max=7}
Разделить числа на четные и нечетные - {false=[1, 3], true=[2, 4]}

Условие: Дана коллекция строк Arrays.asList(«a1», «b2», «c3», «a1»), рассмотрим работу collect и toArray с ней:
Получение списка без дубликатов - [a1, b2, c3]
Получить массив строк без дубликатов и в верхнем регистре - {A1, B2, C3}
Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b> - <b> a1: b2: c3: a1 </b>
Преобразовать в map, где первый символ ключ, второй символ значение	 - {a=1, b=2, c=3}
Преобразовать в map, сгруппировав по первому символу строки - 	{a=[a1, a1], b=[b2], c=[c3]}
Преобразовать в map, сгруппировав по первому символу строки и объединим вторые символы через : - {a=1:1, b=2, c=3}*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        List<String> stringList = Arrays.asList("a1", "b2", "c3", "a1");

        System.out.println(integerList.stream().collect(Collectors.summingInt(v -> v % 2 == 1 ? v : 0)));
        System.out.println(integerList.stream().collect(Collectors.averagingDouble(v -> v - 1)));
        System.out.println(integerList.stream().collect(Collectors.summarizingInt(v -> v + 3)));
        System.out.println(integerList.stream().collect(Collectors.partitioningBy(v -> v % 2 == 0)).entrySet());

        System.out.println(stringList.stream().distinct().collect(Collectors.toList()));
        System.out.println(Arrays.toString(stringList.stream().map(String::toUpperCase).distinct().toArray()));
        System.out.println(stringList.stream().collect(Collectors.joining(": ", "<b> ", " </b>")));
        System.out.println(stringList.stream().distinct().collect(Collectors.toMap(s -> s.substring(0, 1), s -> s.substring(0, 1))));
        System.out.println(stringList.stream().collect(Collectors.groupingBy(s -> s.substring(0, 1))));
        System.out.println(stringList.stream()
                .collect(Collectors
                        .groupingBy(s -> s.substring(0, 1), Collectors
                                .mapping(s -> s.substring(1), Collectors
                                        .joining(":")))));
    }
}
