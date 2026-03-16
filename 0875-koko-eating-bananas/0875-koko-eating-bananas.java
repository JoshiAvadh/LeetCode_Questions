class Solution {

    public int findMax(int[] piles){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while(low <= high) {
            int mid = (low + high)/2;

            if(checkValid(piles, mid, h)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean checkValid(int[] piles, int speed, int h) {
        int calcHours = 0;

        for(int i = 0; i < piles.length; i++) {
            calcHours += Math.ceil((double)piles[i]/speed);
        }
        return calcHours <= h;
    }
}