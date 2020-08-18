public class SudokuElement {
    private int value = -1;
    private int[] possibilities = {1,2,3,4,5,6,7,8,9};

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int[] getPossibilities() {
        return possibilities;
    }
}
