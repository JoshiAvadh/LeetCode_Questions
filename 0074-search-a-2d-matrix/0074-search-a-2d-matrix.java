class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int SR = 0, SC = matrix[0].length - 1;

        while(SR<matrix.length && SC >= 0) {
            if(matrix[SR][SC] == target) {
                return true;
            }
            if(matrix[SR][SC] > target) {
                SC--;
            } else {
                SR++;
            }
        }
        return false;
    }
}