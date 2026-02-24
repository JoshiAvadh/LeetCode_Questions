class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 2;
        int element  = -1;
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) {
            return nums[0];
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length -1];
        }

        while(start <= end) {
            int mid = (start + end)/2;

            if(nums[mid] != nums[mid -1 ] && nums[mid] != nums[mid+1]) {
                element =  nums[mid];
            }
            if((mid%2 == 0 && nums[mid + 1] == nums[mid]) || (mid%2 == 1 && nums[mid - 1] == nums[mid]) ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return element;
    }
}