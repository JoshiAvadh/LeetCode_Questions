class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length - 1;
        
         while(low <= high) {
            int mid = (high+low)/2;
            int row = -1;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < mat.length; i++) {
                

                if(mat[i][mid] > max) {
                    max = mat[i][mid];
                    row = i;
                }
            }
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = mid + 1 < mat[0].length ? mat[row][mid + 1] : Integer.MIN_VALUE;

            if((mat[row][mid] > left) && (mat[row][mid] > right)) {
                return new int[]{row, mid};
            } if(mat[row][mid] < right){
                low = mid +1;
            } else {
                high = mid - 1;
            }
         }
         return new int[]{-1, -1};
    }
}