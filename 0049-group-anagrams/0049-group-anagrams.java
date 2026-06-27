class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int[] freq = new int[27];
            for(int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);
                freq[ch - 'a']++;
            }
            if(!map.containsKey(Arrays.toString(freq))){
                map.put(Arrays.toString(freq), new ArrayList());
            } 
            map.get(Arrays.toString(freq)).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}