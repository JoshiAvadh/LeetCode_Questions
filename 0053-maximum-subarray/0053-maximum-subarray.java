class Solution {
    public boolean ifAllNegative(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                return false;
            }
        }
        return true;
    }
    public int maxSubArray(int[] nums) {
        if(ifAllNegative(nums)) {
            int min = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > min) {
                    min = nums[i];
                }
            }
            return min;
        }
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}