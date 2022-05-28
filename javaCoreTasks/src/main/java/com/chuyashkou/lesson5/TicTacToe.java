package com.chuyashkou.lesson5;

/*Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
по очереди вводят координаты клетки в которую хотят сделать ход. После
каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
Игра продолжается до победы одного из игроков или ничьи.*/

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        int i, j;
        int step = 1;
        boolean win = false;
        String player = "   X  ", checkWin = "";
        Scanner scanner = new Scanner(System.in);
        String[][] gamePad = {{"[0][0]", "[0][1]", "[0][2]"}, {"[1][0]", "[1][1]", "[1][2]"}, {"[2][0]", "[2][1]", "[2][2]"}};

        while (true) {
            for (String[] strings : gamePad) {
                for (int l = 0; l < gamePad.length; l++) {

                    if ((gamePad[l][0].equals(checkWin) && gamePad[l][1].equals(checkWin) && gamePad[l][2].equals(checkWin)) ||
                            (gamePad[0][l].equals(checkWin) && gamePad[1][l].equals(checkWin) && gamePad[2][l].equals(checkWin))) {
                        win = true;
                    }
                    if ((gamePad[0][0].equals(checkWin) && gamePad[1][1].equals(checkWin) && gamePad[2][2].equals(checkWin)) ||
                            (gamePad[2][0].equals(checkWin) && gamePad[1][1].equals(checkWin) && gamePad[0][2].equals(checkWin))) {
                        win = true;
                    }

                    System.out.print(strings[l] + " | ");
                }
                System.out.println("\n" + "--------------------------");
            }

            if (win) {
                System.out.println("Победил " + checkWin);
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
                checkWin = (step - 1) % 2 == 0 ? "   О  " : "   X  ";
            } else {
                System.out.println("Клетка занята!");
            }
        }
    }
}
