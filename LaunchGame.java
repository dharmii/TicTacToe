public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        Person p1 = new Person("Dharmika", 'X');
        Person p2 = new Person("Chaitanya", 'O');
        Person cp;
        cp = p1;
        while (true) {
            System.out.println(cp.name + " turn");
            cp.makeMove();
            TicTacToe.displayBoard();
            if (TicTacToe.checkColWin() || TicTacToe.checkDiagonalWin() || TicTacToe.checkRowWin()) {
                System.out.println(cp.name + " has won");
                break;
            } else if (TicTacToe.checkDraw()) {
                System.out.println("Game is draw");
                break;
            } else {
                if (cp == p1) {
                    cp = p2;
                } else {
                    cp = p1;
                }
            }
        }
    }
}
