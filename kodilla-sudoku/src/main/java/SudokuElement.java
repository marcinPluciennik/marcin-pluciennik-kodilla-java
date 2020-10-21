public class SudokuElement {
    private int value = -1;
    private int[] possibilities = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int[] getPossibilities() {
        return possibilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SudokuElement that = (SudokuElement) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public void setPossibilities(int[] possibilities) {
        this.possibilities = possibilities;
    }
}
