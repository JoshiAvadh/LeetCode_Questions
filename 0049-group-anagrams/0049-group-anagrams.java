class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            int[] k = new int[26];

            for(Character c : strs[i].toCharArray()) {
                k[c - 'a']++;
            }
            String key = Arrays.toString(k);

           //HASHMAP FNCS
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(strs[i]);

        } 
        return new ArrayList<>(map.values());
    }
}