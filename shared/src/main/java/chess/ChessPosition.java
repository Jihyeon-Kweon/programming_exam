package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {
    private final int row;
    private final int col;

    public ChessPosition(int row, int col) {
        if(row<1||row>8||col<1||col>8){
            throw new IllegalArgumentException("Row and column must be between 1 and 8.");
        }
        this.row = row;
        this.col = col;
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow() {
        return row;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn() {
        return col;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        ChessPosition that = (ChessPosition) obj;
        return row == that.row&&col == that.col;
    }

    @Override
    public int hashCode(){
        return 31 * row + col;
    }

    @Override
    public String toString(){
        return "ChessPosition{" + "row=" + ", col=" + col + "}";
    }










}


