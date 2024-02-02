/*
 * You are given a 2D array and each cell has some eggs in it represented by a number. 
 * you have to start at (0,0) you can either move right or left. now when you reach (m,n) you shd hav collected max eggs. 
 * WAP to print max number of eggs that can be collected in a given matrix.
 */

 public class MaxEggsCollection {

    public static int maxEggs(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        System.out.println("m: " + m + ",  n: " + n);
        // Create a 2D array to store the maximum number of eggs at each cell
        int[][] dp = new int[m][n];

        // Initialize the first cell
        dp[0][0] = grid[0][0];

        // Fill the first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill the first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the rest of the cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // Choose the path with the maximum number of eggs
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        // The bottom-right cell contains the maximum number of eggs
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = maxEggs(grid);
        System.out.println("Maximum number of eggs collected: " + result);
    }
}
