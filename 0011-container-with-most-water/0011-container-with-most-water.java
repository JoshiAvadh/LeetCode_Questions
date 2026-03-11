class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        // for(int i = 0; i < height.length; i++) {
        //     for(int j = i + 1; j < height.length; j++) {
        //         int currWater = (j - i) * Math.min(height[i], height[j]);
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }
        // return maxWater;

        int low = 0, high = height.length - 1;

        while(low < high) {
            int currWater = (high - low) * Math.min(height[low], height[high]);
            maxWater = maxWater > currWater ? maxWater : currWater; 
            if(height[low] > height[high]) high--;
            else low++;
        }
        return maxWater;
    }
}