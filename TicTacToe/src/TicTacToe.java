import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws Exception {
       
        char [][] gameboard = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};

        

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scan.nextInt();

        System.out.println(pos);
        placePiece(gameboard, pos, "player");
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

    public static void placePiece(char[][] gameboard, int pos, String user) {

                char symbol = ' ';
            if (user.equals("player")) {
                 symbol = 'x';
            } else if (user.equals("cpu")){
                symbol = 'o';
            }

        switch(pos) {
            case 1:
                gameboard[0][0] = 'x';
                break;
            case 2:
                gameboard[0][2] = 'x';
                break;
            case 3:
                gameboard[0][4] = 'x';
                break;
            case 4:
                gameboard[2][0] = 'x';
                break;
            case 5:
                gameboard[2][2] = 'x';
                break;
            case 6:
                gameboard[2][4] = 'x';
                break;
            case 7:
                gameboard[4][0] = 'x';
                break;
            case 8:
                gameboard[4][2] = 'x';
                break;
            case 9:
                gameboard[4][4] = 'x';
                break;
        }
    }
}
