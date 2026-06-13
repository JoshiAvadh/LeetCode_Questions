class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new int[] {i, j});
                } else if(grid[i][j] == 1) {
                    fresh++;
                }  
            }
        }
        if(fresh == 0) return 0;

        int dir[][] = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        int min = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            boolean rott = false;

            for(int i = 0; i < size; i++) {
                int[] cell = q.remove();
                int r = cell[0], c = cell[1];

                for(int d[] : dir) {
                    int nextR = r + d[0];
                    int nextC = c + d[1];

                    if(nextR >= 0 && nextR < n && nextC >= 0 && nextC < m && grid[nextR][nextC] == 1) {
                        grid[nextR][nextC] = 2;
                        rott = true;
                        fresh--;
                        q.add(new int[] {nextR, nextC});
                    }
                }
            }
            if(rott) min++;
        }
        return fresh == 0 ? min : -1;
    }
}