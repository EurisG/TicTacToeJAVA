import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {
       
        char [][] gameBoard = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};

        
        printGameBoard(gameBoard);
       

        while(true) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Enter your placement (1-9):");
                int playerPos = scan.nextInt();
                while(playerPosition.contains(playerPos) || cpuPosition.contains(playerPos)) {
                    System.out.println("Position taken! Enter a correct Position");
                    playerPos =scan.nextInt();
                }
   
                placePiece(gameBoard, playerPos, "player");
            }
            Random r = new Random();
            int cpuPos = r.nextInt(9) + 1;
            placePiece(gameBoard, cpuPos, "cpu");
    
            printGameBoard(gameBoard);
            String result = checkWinner();
            System.out.println(result);
        }
        
       
    }

    public static void printGameBoard(char[][] gameBoard) {

        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int playerPos, String user) {

                char symbol = ' ';
            if (user.equals("player")) {
                 symbol = 'X';
                 playerPosition.add(playerPos);
            } else if (user.equals("cpu")){
                symbol = 'O';
                cpuPosition.add(playerPos);
            }

        switch(playerPos) {
            case 1:
                gameBoard[0][0] = 'x';
                break;
            case 2:
                gameBoard[0][2] = 'x';
                break;
            case 3:
                gameBoard[0][4] = 'x';
                break;
            case 4:
                gameBoard[2][0] = 'x';
                break;
            case 5:
                gameBoard[2][2] = 'x';
                break;
            case 6:
                gameBoard[2][4] = 'x';
                break;
            case 7:
                gameBoard[4][0] = 'x';
                break;
            case 8:
                gameBoard[4][2] = 'x';
                break;
            case 9:
                gameBoard[4][4] = 'x';
                break;
        }
    }
    public static String checkWinner() {
        
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rigCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rigCol);
        winning.add(cross1);
        winning.add(cross2);
        
            for(List l : winning) {
                if(playerPosition.contains(l)) {
                    return "Congratulations you won!";
                } else if(cpuPosition.contains(l)) {
                    return "CPU  wins! Sorry..";
                } else if (playerPosition.size() + cpuPosition.size() == 9) {
                    return "Try Again!";
                }
            }
        return "";
    }
}
