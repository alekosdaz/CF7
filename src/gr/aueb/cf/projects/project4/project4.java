package gr.aueb.cf.projects.project4;
import java.util.Scanner;

public class project4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Δημιουργία του πίνακα του παιχνιδιού
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // Αρχικοποίηση με κενές θέσεις
            }
        }

        char currentPlayer = 'X'; // Ο πρώτος παίκτης είναι ο 'X'
        boolean gameWon = false;
        boolean tie = false;

        while (!gameWon && !tie) {
            printBoard(board); // Εμφάνιση του πίνακα
            System.out.println("Player " + currentPlayer + ", it's your turn!");
            System.out.print("Enter row (0-2) and column (0-2) separated by a space: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Έλεγχος αν η θέση είναι ήδη κατειλημμένη
            if (board[row][col] != ' ') {
                System.out.println("This position is already taken. Try again.");
                continue;
            }

            // Τοποθέτηση του τρέχοντος παίκτη στη θέση
            board[row][col] = currentPlayer;

            // Έλεγχος αν ο τρέχων παίκτης κέρδισε
            if (checkWinner(board, currentPlayer)) {
                gameWon = true;
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
            }
            // Έλεγχος αν το παιχνίδι είναι ισόπαλο
            else if (isBoardFull(board)) {
                tie = true;
                printBoard(board);
                System.out.println("It's a tie!");
            }

            // Εναλλαγή παίκτη
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    // Μέθοδος για να εμφανίζουμε τον πίνακα
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Μέθοδος για να ελέγξουμε αν κάποιος κέρδισε
    public static boolean checkWinner(char[][] board, char player) {
        // Έλεγχος για γραμμές
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Έλεγχος για στήλες
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // Έλεγχος για διαγώνιες
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    // Μέθοδος για να ελέγξουμε αν ο πίνακας είναι γεμάτος (ισοπαλία)
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}


