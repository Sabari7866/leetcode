// Last updated: 9/2/2026, 1:47:17 PM
class Solution {
    public int countArrangement(int n) {
        boolean[] used = new boolean[n + 1];
        return solve(1, n, used);
    }

    public int solve(int pos, int n, boolean[] used) {
        if (pos > n)
            return 1;

        int count = 0;

        for (int num = 1; num <= n; num++) {
            if (!used[num] && (num % pos == 0 || pos % num == 0)) {
                used[num] = true;
                count += solve(pos + 1, n, used);
                used[num] = false;
            }
        }

        return count;
    }
}