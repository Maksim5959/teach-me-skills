package chuyashkou.lessonsOOP.recursion;

public class RecursionApp {

    public static void main(String[] args) {
        outputValues(1, 5);
    }

    private static void outputValues (int a, int b) {
        if (a > b) {
            outputValues(a, b + 1);
            System.out.print(b + " ");
        } else if (a < b) {
            outputValues(a, b - 1);
            System.out.print(b + " ");
        } else {
            System.out.print(a + " ");
        }
    }
}
