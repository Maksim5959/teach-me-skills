package chuyashkou.lesson3;

public class Task2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 10;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует:)");
        } else {
            System.out.println("Треугольник не существует :(");
        }
    }
}
