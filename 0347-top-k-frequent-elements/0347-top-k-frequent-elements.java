class Solution {
    // class Info implements Comparable<Info> {
    //     int num, freq;

    //     Info(int num, int freq) {
    //         this.num = num;
    //         this.freq = freq;
    //     }
    //     @Override
    //     public int compareTo(Info i2) {
    //         return i2.freq - this.freq;
    //     }
    //}
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int[] ans = new int[k];

        // for(int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }


        // PriorityQueue<Info> pq = new PriorityQueue<>();

        // for(int key : map.keySet()) {
        //     pq.add(new Info(key, map.get(key)));
        // }

        // for(int i = 0; i < k; i++) {
        //     ans[i] = pq.peek().num;
        //     pq.remove();
        // }
        // return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()) {
            freq[map.get(key)].add(key);
        }

        int result[] = new int[k];
        int idx = 0;
        for(int i = freq.length - 1; i >= 0; i--) {
            for(int n : freq[i]) {
                result[idx] = n;
                idx++;
                if(idx == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
