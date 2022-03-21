package chuyashkou.lesson4;

/*4)Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения.*/

public class Task4 {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        int result = 0;

        for (int i = b; i > 0; i--) {
            result = result + a;
        }

        System.out.println(result);
    }
}
