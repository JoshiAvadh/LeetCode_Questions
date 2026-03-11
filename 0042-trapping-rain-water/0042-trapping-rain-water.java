class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftB[] = new int[n];
        int rightB[] = new int[n];

        leftB[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftB[i] = Math.max(leftB[i-1], height[i]);
        }

        rightB[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightB[i] = Math.max(rightB[i+1], height[i]);
        }
        int trapped = 0;

        for(int i = 0; i < n; i++) {
            trapped += (Math.min(leftB[i], rightB[i]) - height[i]);
        }
        return trapped;
    }
}