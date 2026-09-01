// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n = matrix.length;
//         int m = matrix[0].length;

//         int top = 0, bottom = m - 1;

//         while(top <= bottom) {
//             int row = (top + bottom)/2;

//             if(target < matrix[row][0]) {
//                 bottom = row - 1;
//             } else if(target > matrix[row][m - 1]) {
//                 top = row + 1;
//             } else {
//                 break;
//             }
//         }

//         int row = (top + bottom)/2;
//         int l = 0, r = matrix[0].length - 1;

//         while(l <= r) {
//             int mid = (l + r)/2;

//             if(target > matrix[row][mid]) {
//                 l = mid + 1;
//             } else if(target < matrix[row][mid]) {
//                 r = mid - 1;
//             }
//             else {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int low = n - 1;

        while (top <= low) {
            int row = (top + low) / 2;

            if (matrix[row][m - 1] < target) {
                top = row + 1;
            } else if (matrix[row][0] > target) {
                low = row - 1;
            } else {
                break;
            }
        }

        int l = 0, r = matrix[0].length - 1;
        int row = (top + low) / 2;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (target > matrix[row][mid]) l = mid + 1;
            else if(target < matrix[row][mid]) r = mid - 1;
            else return true;
        }
        return false;
    }
}