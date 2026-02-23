class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx[] = {-1, -1};
        int start = 0;
        int end = nums.length - 1;

        
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] == target) {
                idx[0] = idx[1] = mid;
                start = end = mid;
                while(start >= 0 && nums[start] == target) {
                    idx[0] = start;
                    start--;
                }
                while(end < nums.length && nums[end] == target) {
                    idx[1] = end;
                    end++;
                }
                return idx;
            }
            if(nums[mid] < target) {
                start = mid +1;
            } else {
                end = mid - 1; 
            }
        } 
        return idx;
    }
}