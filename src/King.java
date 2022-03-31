public class King extends ChessPiece{
    public King(String color) {
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
        } else if (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 0) {
            return false;
        } else if (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0 || Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 1) {
            return true;
        } else if (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public Boolean isUnderAttack(ChessBoard board, int line, int column) {
        return false;
    }
}
