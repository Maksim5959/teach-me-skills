package chuyashkou.lesson4;

/*5)Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

public class Task5 {

    public static void main(String[] args) {

        for (double i = 1, centimeter; i <= 20; i++) {
            centimeter = i * 2.54;
            System.out.println("В " + Math.round(i) + " дюйме(ах) - " + centimeter + " сантиметра(ов);");
        }
    }
}
