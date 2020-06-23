import java.util.Scanner;

public class UserInput {
    private int x;
    private int y;
    private int value;
    private String gameOver = "";
    private final String SUDOKU = "SUDOKU";

    public int loadUserInputX() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter X (1-10):");
        if (s.hasNextInt()) {
            int inputX = s.nextInt();
            if (inputX < 1 || inputX > 10) {
                System.out.println("X must be 1-10! Try again");
                loadUserInputX();
            } else {
                x = inputX;
            }
        } else {
            String inputString = s.nextLine().toUpperCase();
            if (inputString.equals(SUDOKU)){
                gameOver = inputString;
            }else{
                System.out.println("It's not a number! Try again");
                loadUserInputX();
            }
        }
        return x;
    }

    public int loadUserInputY() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter y (1-10):");
        if (s.hasNextInt()) {
            int inputY = s.nextInt();
            if (inputY < 1 || inputY > 10) {
                System.out.println("Y must be 1-10! Try again");
                loadUserInputY();
            } else {
                y = inputY;
            }
        } else {
            String inputString = s.nextLine().toUpperCase();
            if (inputString.equals(SUDOKU)){
                gameOver = inputString;
            }else{
                System.out.println("It's not a number! Try again");
                loadUserInputY();
            }
        }
        return y;
    }

    public int loadUserInputValue() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value (0-9):");
        if (s.hasNextInt()) {
            int valueInput = s.nextInt();
            if (valueInput < 1 || valueInput > 10) {
                System.out.println("Value must be 0-9! Try again");
                loadUserInputValue();
            } else {
                value = valueInput;
            }
        } else {
            String inputString = s.nextLine().toUpperCase();
            if (inputString.equals(SUDOKU)){
                gameOver = inputString;
            }else{
                System.out.println("It's not a number! Try again");
                loadUserInputX();
            }
        }
        return value;
    }

    public void newGameAfterSudoku(){
        if (gameOver.equals(SUDOKU)){
            Scanner s = new Scanner(System.in);
            System.out.println("Press ENTER twice to play again or any key + ENTER to quit game");
            String newGameOrNot = s.nextLine();
            if (newGameOrNot.equals("")){
                System.out.println("NEW GAME");
            }else{
                System.exit(0);
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

}
