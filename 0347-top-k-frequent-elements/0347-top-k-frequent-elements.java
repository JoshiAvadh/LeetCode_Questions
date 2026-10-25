class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
 
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()) {
            bucket[map.get(key)].add(key);
        }
        int[] ans = new int[k];
        int a = 0;

        for(int i = bucket.length - 1; i >= 0; i--) {
            while(bucket[i].size() != 0 && k > 0) {
                ans[a] = bucket[i].remove(0);
                a++;
                k--;
            }
        }
        return ans;
    }
}