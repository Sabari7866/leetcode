# Last updated: 9/11/2026, 11:51:28 AM
class Solution:
    def totalNQueens(self, n):
        def solve(row, board):
            if row == n:
                return 1

            count = 0

            for col in range(n):
                safe = True

                for r in range(row):
                    old_col = board[r]

                    # Same column
                    if old_col == col:
                        safe = False

                    # Same diagonal
                    if abs(row - r) == abs(col - old_col):
                        safe = False

                if safe:
                    board.append(col)
                    count += solve(row + 1, board)
                    board.pop()

            return count

        return solve(0, [])