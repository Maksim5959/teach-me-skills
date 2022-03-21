package chuyashkou.lesson5;

/*Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
по очереди вводят координаты клетки в которую хотят сделать ход. После
каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
Игра продолжается до победы одного из игроков или ничьи.*/

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        int i, j;
        String player = "   X  ";
        int step = 1;
        Scanner scanner = new Scanner(System.in);
        String[][] gamePad = {{"[0][0]", "[0][1]", "[0][2]"}, {"[1][0]", "[1][1]", "[1][2]"}, {"[2][0]", "[2][1]", "[2][2]"}};

        while (true) {

            for (String[] array : gamePad) {
                for (String a : array) {
                    System.out.print(a + " | ");
                }
                System.out.println("\n" + "--------------------------");
            }

            if ((gamePad[0][0].equals("   X  ") && gamePad[0][1].equals("   X  ") && gamePad[0][2].equals("   X  ")) ||
                    (gamePad[1][0].equals("   X  ") && gamePad[1][1].equals("   X  ") && gamePad[1][2].equals("   X  ")) ||
                    (gamePad[2][0].equals("   X  ") && gamePad[2][1].equals("   X  ") && gamePad[2][2].equals("   X  ")) ||
                    (gamePad[0][0].equals("   X  ") && gamePad[1][0].equals("   X  ") && gamePad[2][0].equals("   X  ")) ||
                    (gamePad[0][1].equals("   X  ") && gamePad[1][1].equals("   X  ") && gamePad[2][1].equals("   X  ")) ||
                    (gamePad[0][2].equals("   X  ") && gamePad[1][2].equals("   X  ") && gamePad[2][2].equals("   X  ")) ||
                    (gamePad[0][0].equals("   X  ") && gamePad[1][1].equals("   X  ") && gamePad[2][2].equals("   X  ")) ||
                    (gamePad[0][2].equals("   X  ") && gamePad[1][1].equals("   X  ") && gamePad[2][0].equals("   X  "))) {
                System.out.println("Победил Х");
                break;
            } else if ((gamePad[0][0].equals("   О  ") && gamePad[0][1].equals("   О  ") && gamePad[0][2].equals("   О  ")) ||
                    (gamePad[1][0].equals("   О  ") && gamePad[1][1].equals("   О  ") && gamePad[1][2].equals("   О  ")) ||
                    (gamePad[2][0].equals("   О  ") && gamePad[2][1].equals("   О  ") && gamePad[2][2].equals("   О  ")) ||
                    (gamePad[0][0].equals("   О  ") && gamePad[1][0].equals("   О  ") && gamePad[2][0].equals("   О  ")) ||
                    (gamePad[0][1].equals("   О  ") && gamePad[1][1].equals("   О  ") && gamePad[2][1].equals("   О  ")) ||
                    (gamePad[0][2].equals("   О  ") && gamePad[1][2].equals("   О  ") && gamePad[2][2].equals("   О  ")) ||
                    (gamePad[0][0].equals("   О  ") && gamePad[1][1].equals("   О  ") && gamePad[2][2].equals("   О  ")) ||
                    (gamePad[0][2].equals("   О  ") && gamePad[1][1].equals("   О  ") && gamePad[2][0].equals("   О  "))) {
                System.out.println("Победил О");
                break;
            } else if (step == 10) {
                System.out.println("Ничья!");
                break;
            }

            System.out.println("Ход игрока " + player + " введите координаты хода через пробел: ");

            i = scanner.nextInt();
            j = scanner.nextInt();

            if (!gamePad[i][j].equals("   О  ") && !gamePad[i][j].equals("   X  ")) {
                gamePad[i][j] = player;
                ++step;
                player = step % 2 == 0 ? "   О  " : "   X  ";
            } else {
                System.out.println("Клетка занята!");
            }
        }
    }
}
