class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int size = s.length();
        HashSet<Character> set = new HashSet<>();

        int l = 0;

        set.add(s.charAt(0));
        int ans = 1;

        for (int r = 1; r < size; r++) {
            while (set.contains(s.charAt(r)) && l < r) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}
