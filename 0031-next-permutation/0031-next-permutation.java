class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;

        for(int i = nums.length - 1; i > 0 ; i--) {
            if(nums[i] > nums[i-1]) {
                idx = i - 1;
                break;
            }
        }
        if(idx != -1) {
            for(int i = nums.length - 1; i > idx; i--) {
                if(nums[i] > nums[idx]) {
                    int temp = nums[idx];
                    nums[idx] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            int start = idx+1; 
            int end = nums.length - 1;
            while(start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        } else{
            int start = 0; 
            int end = nums.length - 1;
            while(start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

    }
}