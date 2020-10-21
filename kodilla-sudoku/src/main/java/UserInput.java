import java.util.Scanner;

public class UserInput {
    private int x;
    private int y;
    private int value;
    private String gameOver = "";
    private final String SUDOKU = "SUDOKU";

    public int loadUserInputX() {
        Scanner s = new Scanner(System.in);


        while (true) {
            System.out.print("Enter number of the row (1-9):");
            String inputString = s.nextLine().toUpperCase();

            if (inputString.equals(SUDOKU)) {
                gameOver = "SUDOKU";
                x = 0;
                return x;
            } else {
                try {
                    int inputX = Integer.parseInt(inputString);
                    if (inputX < 1 || inputX > 9) {
                        System.out.println("Number of the row must be 1-9! Try again");
                    } else {
                        x = inputX;
                        return x;
                    }
                } catch (Exception e) {
                    System.out.println("It's not a number! Try again");
                }
            }
        }
    }

    public int loadUserInputY() {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of the column (1-9):");
            String inputString = s.nextLine().toUpperCase();

            if (inputString.equals(SUDOKU)) {
                gameOver = SUDOKU;
                y = 0;
                return y;
            } else {
                try {
                    int inputY = Integer.parseInt(inputString);
                    if (inputY < 1 || inputY > 9) {
                        System.out.println("Number of the column must be 1-9! Try again");
                    } else {
                        y = inputY;
                        return y;
                    }
                } catch (Exception e) {
                    System.out.println("It's not a number! Try again");
                }
            }
        }
    }

    public int loadUserInputValue() {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter value (1-9):");
            String inputString = s.nextLine().toUpperCase();

            if (inputString.equals(SUDOKU)) {
                gameOver = SUDOKU;
                value = 0;
                return value;
            } else {
                try {
                    int valueInput = Integer.parseInt(inputString);
                    if (valueInput < 1 || valueInput > 9) {
                        System.out.println("Value must be 1-9! Try again");
                    } else {
                        value = valueInput;
                        return valueInput;
                    }
                } catch (Exception e) {
                    System.out.println("It's not a number! Try again");
                }
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValue() {
        return value;
    }

    public String getGameOver() {
        return gameOver;
    }

    public String getSUDOKU() {
        return SUDOKU;
    }

}

