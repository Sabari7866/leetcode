// Last updated: 7/14/2026, 1:54:27 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<String>> result;
    private boolean[] cols;
    private boolean[] posDiag; // (row + col)
    private boolean[] negDiag; // (row - col + n)
    private char[][] board;
    private int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        this.result = new ArrayList<>();
        this.cols = new boolean[n];
        this.posDiag = new boolean[2 * n];
        this.negDiag = new boolean[2 * n];
        this.board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        backtrack(0);
        return result;
    }

    private void backtrack(int row) {
        // Base case: All queens placed
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) {
                solution.add(new String(r));
            }
            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            int pDiag = row + col;
            int nDiag = row - col + n;

            // Skip if column or diagonals are under attack
            if (cols[col] || posDiag[pDiag] || negDiag[nDiag]) {
                continue;
            }

            // Place Queen
            board[row][col] = 'Q';
            cols[col] = true;
            posDiag[pDiag] = true;
            negDiag[nDiag] = true;

            // Recurse to next row
            backtrack(row + 1);

            // Backtrack: Remove Queen and reset state
            board[row][col] = '.';
            cols[col] = false;
            posDiag[pDiag] = false;
            negDiag[nDiag] = false;
        }
    }
}   