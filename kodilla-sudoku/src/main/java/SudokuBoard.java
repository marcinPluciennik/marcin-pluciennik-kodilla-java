import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    List<SudokuRow> rowBoard = new ArrayList<>();
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    SudokuElement[][] board = new SudokuElement[10][];

    public SudokuBoard() {
        for (int n = 0; n < 10; n++) {
            board[n] = new SudokuElement[10];
        }

        SudokuRow sudokuRow0 = new SudokuRow();
        SudokuRow sudokuRow1 = new SudokuRow();
        SudokuRow sudokuRow2 = new SudokuRow();
        SudokuRow sudokuRow3 = new SudokuRow();
        SudokuRow sudokuRow4 = new SudokuRow();
        SudokuRow sudokuRow5 = new SudokuRow();
        SudokuRow sudokuRow6 = new SudokuRow();
        SudokuRow sudokuRow7 = new SudokuRow();
        SudokuRow sudokuRow8 = new SudokuRow();

        rowBoard.add(sudokuRow0);
        rowBoard.add(sudokuRow1);
        rowBoard.add(sudokuRow2);
        rowBoard.add(sudokuRow3);
        rowBoard.add(sudokuRow4);
        rowBoard.add(sudokuRow5);
        rowBoard.add(sudokuRow6);
        rowBoard.add(sudokuRow6);
        rowBoard.add(sudokuRow7);
        rowBoard.add(sudokuRow8);
    }

    public List<SudokuRow> getRowBoard() {
        return rowBoard;
    }

    public static int getMinIndex() {
        return MIN_INDEX;
    }

    public String toString(){

        String result = "";
        for(int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for(int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if(rowBoard.get(n).getRow().get(k).getValue() == -1 ) {
                    result += "_";
                } else {
                    result += rowBoard.get(n).getRow().get(k).getValue();
                }
                result += "|";
            }
            result += "\n";
        }
        return result;

    }

    /*

    public String toString() {
        String result = "";
        for(int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for(int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if(board[n][k] == null) {
                    result += "_";
                } else {
                    result += (board[n][k]).getValue();
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }

     */
}

