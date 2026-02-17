class Solution {
    public void sortColors(int[] nums) {
        int cz = 0, ct = 0, co = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) cz++;
            else if(nums[i] == 1) co++;
            else ct++;
        }
        int p = 0;
        while(cz > 0) {
            nums[p] = 0;
            cz--;
            p++;
        }
        while(co > 0) {
            nums[p] = 1;
            co--;
            p++;
        }
        while(ct > 0 && p < nums.length) {
            nums[p] = 2;
            ct--;
            p++;
        }
    }
}