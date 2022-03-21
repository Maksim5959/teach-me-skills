package chuyashkou.lesson4;

/*8) И ещё можете попрактиковаться и нарисовать оставшиеся 2
реугольника
          *
        * *   (1)
      * * *
    * * * *

    * * * *
      * * *   (2)
        * *
          */

public class Task8 {
    public static void main(String[] args) {

        String[][] triangle1 = new String[4][4];
        String[][] triangle2 = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j + i <= 3) {
                    triangle2[i][j] = "*";
                } else {
                    triangle2[i][j] = " ";
                }
                if (i >= j) {
                    triangle1[i][j] = "*";
                } else {
                    triangle1[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(triangle1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(triangle2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
