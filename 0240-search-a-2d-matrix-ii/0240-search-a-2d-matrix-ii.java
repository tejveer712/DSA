class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Number of rows and columns.
        int n = matrix.length;
        int m = matrix[0].length;

        // Treat the matrix as one sorted array.
        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
}