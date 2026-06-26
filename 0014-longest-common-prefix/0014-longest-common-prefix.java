class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int min = Math.min(first.length(), strs[i].length());
            int z = 0;

            for (int j = 0; j < min; j++) {
                if (strs[i].charAt(j) == first.charAt(j)) {
                    z++;
                } else break;
            }
            first = first.substring(0, z);
        }
        return first;
    }
}