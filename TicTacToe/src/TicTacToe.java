public class TicTacToe {
    public static void main(String[] args) throws Exception {
       
        char [][] gameboard = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameboard);
    }

    public static void printGameBoard(char[][] gameboard) {

        for(char[] row : gameboard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
