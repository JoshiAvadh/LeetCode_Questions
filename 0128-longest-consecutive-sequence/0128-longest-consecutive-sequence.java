class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }
        int max = 0;
        for(int n : set) {
            if(!set.contains(n-1)) {
                int currNum = n;
                int streak = 1;
            
                while(set.contains(currNum+1)) {
                    currNum++;
                    streak++;
                }
                max = max>streak? max : streak;
            }
        }
        return max;
    }
}