import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public static int EMPTY = -1;
    List<SudokuElement> row = new ArrayList<>();

    public SudokuRow(){
        for (int i = 0; i < 10; i++){
            row.add(new SudokuElement(EMPTY));
        }
    }

    public List<SudokuElement> getRow() {
        return row;
    }
}


