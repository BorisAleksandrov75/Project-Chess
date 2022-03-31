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

        if (toLine > 7 || toLine < 0 || toColumn > 7 || toColumn < 0) {
            return false;
        } else if (Math.abs(toColumn - column) == 0 || Math.abs(toLine - line) == 0 || Math.abs(line - toLine) == 0 )  {
            return false;
        }  else if (color.equals("White") && line == 1 && (toLine - line) == 2 && Math.abs(toColumn - column)  == 0) {
            return true;
        } else if (color.equals("White") && (toLine - line) == 1 && Math.abs(toColumn - column)  == 0 ) {
            return true;
        } else if (color.equals("Black") && line == 7 && (line - toLine)  == 2 && Math.abs(toColumn - column)  == 0 ) {
            return true;
        } else if (color.equals("Black") && (line - toLine) == 1 && Math.abs(toColumn - column) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
