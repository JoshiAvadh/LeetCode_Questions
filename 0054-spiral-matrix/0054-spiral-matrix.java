class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int SR = 0, ER = matrix.length - 1, SC = 0, EC = matrix[0].length - 1;
        List<Integer> ls = new ArrayList<>();
        while (SR <= ER && SC <= EC) {
            for (int j = SC; j <= EC; j++) {
                ls.add(matrix[SR][j]);
                if (SC == EC) {
                    break;
                }
                
            }
            for (int i = SR + 1; i <= ER; i++) {
                ls.add(matrix[i][EC]);
            }
            if (SR < ER) {
                for (int j = EC - 1; j >= SC; j--) {
                    ls.add(matrix[ER][j]);
                }
            }
            if (SC < EC) {
                for (int i = ER - 1; i >= SR + 1; i--) {
                    ls.add(matrix[i][SC]);
                }
            }
            SR++;
            ER--;
            SC++;
            EC--;
        }
        return ls;
    }
}