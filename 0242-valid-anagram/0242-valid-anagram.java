class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        
        // HashMap<Character, Integer> sMap = new HashMap<>();
        // HashMap<Character, Integer> tMap = new HashMap<>();

        // for(int i = 0; i < s.length(); i++) {
        //     sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        //     tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // return sMap.equals(tMap);

        int[] arr = new int[26];
        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) return false;
        }
        return true;
    }
}