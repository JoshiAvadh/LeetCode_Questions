class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int prefix[] = new int[nums.length];
        // int suffix[] = new int[nums.length];

        // prefix[0] = 1;
        // suffix[nums.length - 1] = 1;
        
        // for(int i = 1; i < nums.length; i++) {
        //     prefix[i] = prefix[i-1]*nums[i-1];
        // }

        // for(int i = nums.length - 2; i >=0; i--) {
        //     suffix[i] = suffix[i+1]*nums[i+1];
        // }       

        // int prod[] = new int[nums.length];

        // for(int i = 0; i < nums.length; i++) {
        //     prod[i] = prefix[i]*suffix[i];
        // }
        // return prod;

        //space optimize

        int result[] = new int[nums.length];
        result[0] = 1;

        for(int i = 1; i <nums.length; i++) {
            result[i] = nums[i-1]*result[i-1];
        }

        int suffix = 1;
        for(int i = nums.length - 1; i >=0; i--) {
            result[i] = result[i]*suffix;
            suffix *= nums[i];
        }
        return result;
    }
}