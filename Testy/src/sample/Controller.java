package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    private String[][] gameTable = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    public void printGame() {
        for (int i = 0; i < gameTable.length; i++) {
            System.out.println(Arrays.toString(gameTable[i]));
        }
    }

    public String[][] getGameTable() {
        return gameTable;
    }

    public void userMove() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x coordinate (0,1,2): ");
        int x = s.nextInt();
        if (x < 0 && x > 2) {
            System.out.println("Wrong coordinate, must be 0, 1 or 2!");
            userMove();
        }

        System.out.print("Enter y coordinate (0,1,2): ");
        int y = s.nextInt();
        if (y < 0 && y > 2) {
            System.out.println("Wrong coordinate, must be 0, 1 or 2!");
            userMove();
        }

        if (gameTable[x][y].equals(" ")) {
            gameTable[x][y] = "X";
        } else {
            System.out.println("Error - it's not allowed move! Try again!");
            userMove();
        }
    }

    public void computerMoveNormal() {
        if (gameTable[1][1].equals(" ")) {
            gameTable[1][1] = "O";
        } else if (!gameTable[1][1].equals(" ") && gameTable[0][0].equals(" ") && gameTable[0][1].equals(" ") &&
                gameTable[0][2].equals(" ") && gameTable[1][0].equals(" ") && gameTable[1][2].equals(" ") &&
                gameTable[2][0].equals(" ") && gameTable[2][1].equals(" ") && gameTable[2][2].equals(" ")) {
            int x1 = random012();
            int y1 = random012();
            if (gameTable[x1][y1].equals(" ")) {
                gameTable[x1][y1] = "O";
            } else {
                computerMoveNormal();
            }
        }

    }

    public int random012() {
        int[] array = {0, 1, 2};
        int x = new Random().nextInt(array.length);
        return array[x];
    }


    public void computerMoveNormal2() {
        if (gameTable[0][0].equals("O") && gameTable[0][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[0][2].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][1].equals("O") && gameTable[0][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[1][0].equals("O") && gameTable[1][1].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[1][2].equals("O") && gameTable[1][1].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[2][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[2][2].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[2][2].equals("O") && gameTable[2][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[1][0].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[2][0].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[1][0].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[0][1].equals("O") && gameTable[1][1].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[1][1].equals("O") && gameTable[2][1].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][2].equals("O") && gameTable[1][2].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[0][2].equals("O") && gameTable[2][2].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[2][2].equals("O") && gameTable[1][2].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[1][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[1][1].equals("O") && gameTable[2][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[0][2].equals("O") && gameTable[1][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[1][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[0][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[0][2].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][1].equals("X") && gameTable[0][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[1][0].equals("X") && gameTable[1][1].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[1][2].equals("X") && gameTable[1][1].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[2][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[2][2].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[2][2].equals("X") && gameTable[2][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[1][0].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[2][0].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[1][0].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[0][1].equals("X") && gameTable[1][1].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[1][1].equals("X") && gameTable[2][1].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][2].equals("X") && gameTable[1][2].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[0][2].equals("X") && gameTable[2][2].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[2][2].equals("X") && gameTable[1][2].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[1][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[1][1].equals("X") && gameTable[2][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[0][2].equals("X") && gameTable[1][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[1][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else {
            int x2 = random012();
            int y2 = random012();
            if (gameTable[x2][y2].equals(" ")) {
                gameTable[x2][y2] = "O";
            } else {
                computerMoveNormal2();
            }
        }
    }


    public int random02() {
        int[] array = {0, 2};
        int x = new Random().nextInt(array.length);
        return array[x];
    }

    public void computerMoveExpert() {
        if (gameTable[1][1].equals(" ")) {
            gameTable[1][1] = "O";
        } else if (gameTable[1][1].equals("X") && gameTable[0][0].equals(" ") && gameTable[0][1].equals(" ") &&
                gameTable[0][2].equals(" ") && gameTable[1][0].equals(" ") && gameTable[1][2].equals(" ") &&
                gameTable[2][0].equals(" ") && gameTable[2][1].equals(" ") && gameTable[2][2].equals(" ")) {
            int x1 = random02();
            int y1 = random02();
            gameTable[x1][y1] = "O";
        }
    }

    public void computerMoveExpert2() {
        if (gameTable[0][0].equals("O") && gameTable[0][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[0][2].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][1].equals("O") && gameTable[0][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[1][0].equals("O") && gameTable[1][1].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[1][2].equals("O") && gameTable[1][1].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[2][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[2][2].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[2][2].equals("O") && gameTable[2][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[1][0].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[2][0].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[1][0].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[0][1].equals("O") && gameTable[1][1].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[1][1].equals("O") && gameTable[2][1].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][2].equals("O") && gameTable[1][2].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[0][2].equals("O") && gameTable[2][2].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[2][2].equals("O") && gameTable[1][2].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("O") && gameTable[1][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[1][1].equals("O") && gameTable[2][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[0][2].equals("O") && gameTable[1][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[2][0].equals("O") && gameTable[1][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[0][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[0][2].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][1].equals("X") && gameTable[0][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[1][0].equals("X") && gameTable[1][1].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[1][2].equals("X") && gameTable[1][1].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[2][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[2][2].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[2][2].equals("X") && gameTable[2][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[1][0].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[2][0].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[1][0].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[0][1].equals("X") && gameTable[1][1].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
        } else if (gameTable[1][1].equals("X") && gameTable[2][1].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
        } else if (gameTable[0][2].equals("X") && gameTable[1][2].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[0][2].equals("X") && gameTable[2][2].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
        } else if (gameTable[2][2].equals("X") && gameTable[1][2].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[0][0].equals("X") && gameTable[1][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
        } else if (gameTable[1][1].equals("X") && gameTable[2][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
        } else if (gameTable[0][2].equals("X") && gameTable[1][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
        } else if (gameTable[2][0].equals("X") && gameTable[1][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
        } else if (gameTable[1][1].equals("X") && gameTable[0][0].equals(" ") && gameTable[0][1].equals(" ") &&
                gameTable[0][2].equals(" ") && gameTable[1][0].equals(" ") && gameTable[1][2].equals(" ") &&
                gameTable[2][0].equals(" ") && gameTable[2][1].equals(" ") && gameTable[2][2].equals(" ")) {
            int x = random02();
            int y = random02();
            gameTable[x][y] = "O";
        }else if (gameTable[0][0].equals(" ") || gameTable[0][1].equals(" ") ||
                gameTable[0][2].equals(" ") || gameTable[1][0].equals(" ") || gameTable[1][2].equals(" ") ||
                gameTable[2][0].equals(" ") || gameTable[2][1].equals(" ") || gameTable[2][2].equals(" ")){
            int x = random02();
            int y = random02();
            if (gameTable[x][y].equals(" ")){
                gameTable[x][y] = "O";
            }else{
                computerMoveExpert2();
            }
        }else {
            int x2 = random012();
            int y2 = random012();
            if (gameTable[x2][y2].equals(" ")) {
                gameTable[x2][y2] = "O";
            } else {
                computerMoveExpert2();
            }
        }
    }
}
