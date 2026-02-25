class Solution {
    public int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }   

    public int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(nums[mid] <= target) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
            if(nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);
        return arr;
    }
}