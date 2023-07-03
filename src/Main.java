import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();

        System.out.println(board.makeMove(1, 1));//X
        System.out.println(board.makeMove(1, 1));//0
        System.out.println(board.makeMove(1, 3));//X
        System.out.println(board.makeMove(1, 2));//0
        for (int i = 0; i < board.getField().length; i++){
            System.out.println(Arrays.toString(board.getField()[i]));
        }
        System.out.println(board.makeMove(2, 2));//0
        System.out.println(board.makeMove(2, 1));//X
        System.out.println(board.makeMove(3, 1));//0
        for (int i = 0; i < board.getField().length; i++){
            System.out.println(Arrays.toString(board.getField()[i]));
        }
        System.out.println(board.makeMove(3, 2));//X
        System.out.println(board.makeMove(2, 3));//0
        System.out.println(board.makeMove(3, 3));//X

        for (int i = 0; i < board.getField().length; i++){
            System.out.println(Arrays.toString(board.getField()[i]));
        }
    }
}