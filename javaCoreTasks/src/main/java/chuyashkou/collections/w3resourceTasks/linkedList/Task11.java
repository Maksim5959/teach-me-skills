package chuyashkou.collections.w3resourceTasks.linkedList;

//11. Write a Java program to display the elements and their positions in a linked list.

import java.util.LinkedList;

public class Task11 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        printElementWithPositions(colors);
    }

    private static void printElementWithPositions(LinkedList<String> colors) {
        LinkedList<String> elementsWithPositions = new LinkedList<>();
        for (int i = 0; i < colors.size(); i++) {
            elementsWithPositions.add(String.format("%s - %s", colors.get(i), i));
        }
        System.out.println(elementsWithPositions);
    }
}
