// Last updated: 7/14/2026, 1:53:35 PM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // Handle the case of only two points, which always form a straight line.
        if (coordinates.length <= 2) {
            return true;
        }

        // Get the coordinates of the first two points to establish a reference "slope".
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        // Calculate the initial delta values (change in x and change in y).
        int dx0 = x1 - x0;
        int dy0 = y1 - y0;

        // Iterate through the remaining points starting from the third point.
        for (int i = 2; i < coordinates.length; ++i) {
            int x_curr = coordinates[i][0];
            int y_curr = coordinates[i][1];

            // Calculate the delta values for the current point relative to the first point.
            int dx_curr = x_curr - x0;
            int dy_curr = y_curr - y0;

            // Check if the cross-product is zero. If (y_curr - y0) * (x1 - x0) != (x_curr - x0) * (y1 - y0),
            // it means the points are not collinear. This avoids division and handles vertical lines.
            if (dy_curr * dx0 != dx_curr * dy0) {
                return false;
            }
        }

        // If all points satisfy the collinearity condition, they form a straight line.
        return true;
    }
}