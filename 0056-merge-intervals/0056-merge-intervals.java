class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (row1, row2) -> Integer.compare(row1[0], row2[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                currentInterval = intervals[i];
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][2]);
    }
}