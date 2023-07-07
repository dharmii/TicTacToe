import java.util.Scanner;

public class Person {
    String name;
    char mark;

    public Person(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        int row;
        int col;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter position");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);

    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (TicTacToe.board[row][col] == ' ') {
                return true;
            }
        }
        return false;
    }

}
