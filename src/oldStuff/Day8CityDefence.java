package oldStuff;

public class Day8CityDefence {
    private int row;
    private int column;

    public Day8CityDefence(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String stringPosition1(int changeColumn) {
        getColumn();
        int newColumn = column - changeColumn;
        setColumn(newColumn);

        String position1 = "(" + row + ", " + column + ")";

        int newColumn2 = column + changeColumn;
        setColumn(newColumn2);

        return position1;
    }

    public String stringPosition2(int changeRow) {
        getRow();
        int newRow = row - changeRow;
        setRow(newRow);

        String position2 = "(" + row + ", " + column + ")";

        int newRow2 = row + changeRow;
        setRow(newRow2);

        return position2;
    }

    public String stringPosition3(int changeColumn) {
        getColumn();
        int newColumn = column + changeColumn;
        setColumn(newColumn);

        String position3 = "(" + row + ", " + column + ")";

        int newColumn2 = column - changeColumn;
        setColumn(newColumn2);

        return position3;
    }

    public String stringPosition4(int changeRow) {
        getRow();
        int newRow = row + changeRow;
        setRow(newRow);

        String position4 = "(" + row + ", " + column + ")";

        int newRow2 = row - changeRow;
        setRow(newRow2);

        return position4;
    }

}
