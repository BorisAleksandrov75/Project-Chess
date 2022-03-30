public class Pawn extends ChessPiece{

    static int a = 0;

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (toLine > 8 || toLine < 1 || toColumn > 7 || toColumn < 0) {
            return false;
        } else if (Math.abs(toColumn - column) == 0 && Math.abs(toLine - line) == 0) {
            return false;
        }  else if (color.equals("White") && column == 1 && toColumn - column == 2 && Math.abs(toLine - line)  == 0) {
            return true;
        } else if (color.equals("Black") && column == 6 && column - toColumn  == 2 && Math.abs(toLine - line)  == 0 ) {
            return true;
        } else if (toColumn - column == 1 && Math.abs(toLine - line)  == 0 || column - toColumn == 1 && Math.abs(toLine - line) == 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
