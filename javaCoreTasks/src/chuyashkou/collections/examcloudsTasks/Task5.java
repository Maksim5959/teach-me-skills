package chuyashkou.collections.examcloudsTasks;

/*5. Создать очередь
Создать очередь, содержащую объекты класса HeavyBox.
Используем класс ArrayDeque.
Поместить объекты в очередь с помощью метода offer().
Удалить объекты методом poll().*/

import chuyashkou.collections.examcloudsTasks.box.HeavyBox;

import java.util.ArrayDeque;
import java.util.Queue;

public class Task5 {

    public static void main(String[] args) {

        Queue<HeavyBox> heavyBoxes = createHeavyBoxDeque();

        while (heavyBoxes.peek() != null) {
            heavyBoxes.forEach(System.out::println);
            System.out.println();
            heavyBoxes.poll();
        }
        System.out.println(heavyBoxes);

    }

    private static Queue<HeavyBox> createHeavyBoxDeque() {
        Queue<HeavyBox> heavyBoxes = new ArrayDeque<>();
        for (int i = 2; i < 11; i++) {
            heavyBoxes.offer(new HeavyBox(i, i, i, i));
        }
        return heavyBoxes;
    }
}
