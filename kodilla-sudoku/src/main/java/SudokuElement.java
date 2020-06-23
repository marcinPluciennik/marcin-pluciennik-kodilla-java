public class SudokuElement {
    private int value;
    private int[] possibilities = {1,2,3,4,5,6,7,8,9};

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
