class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m * n - 1;
        
        while (l <= r) {
            int mid = (l + r) / 2;
            int i = mid / n;
            int j = mid % n;
            
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        return false;
    }
}
