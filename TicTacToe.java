public class TicTacToe 
{

    public static void main(String[] args)
    {

        SquareBoard board = new SquareBoard(3, new XOPiece());
        board.printBoardCoordinates();
        System.out.println(board);
        
    }

}
