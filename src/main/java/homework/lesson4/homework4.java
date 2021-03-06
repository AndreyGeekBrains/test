package homework.lesson4;

import java.util.Random;
import java.util.Scanner;

class homework4 {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new homework4().game();
    }

    homework4() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[5][5];
    }

    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printTable();
    }

    void initTable() {
        for (int row = 0; row < 5; row++)
            for (int col = 0; col < 5; col++)
                table[row][col] = SIGN_EMPTY;
    }
    void printTable() {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }
    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..5):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 5|| y >= 5)
            return false;
        return table[y][x] == SIGN_EMPTY;
    }
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(5);
            y = random.nextInt(5);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }
    boolean checkWin(char dot) {
        for (int i = 0; i < 5; i++)
            if ((table[i][0] == dot && table[i][1] == dot &&
                    table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&
                            table[2][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
                table[2][2] == dot) ||
                (table[2][0] == dot && table[1][1] == dot &&
                        table[0][2] == dot))
            return true;
        return false;
    }
    boolean isTableFull() {
        for (int row = 0; row < 5; row++)
            for (int col = 0; col < 5; col++)
                if (table[row][col] == SIGN_EMPTY)
                    return false;
        return true;
    }
}
