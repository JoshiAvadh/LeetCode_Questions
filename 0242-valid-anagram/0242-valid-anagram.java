class Solution {
    public boolean isAnagram(String s, String t) {
        // int[] count = new int[26];

        // if(s.length() != t.length()) {
        //     return false;
        // }

        // for(int i = 0; i < s.length(); i++){
        //     char chS = s.charAt(i);
        //     count[chS - 'a']++;
        //     char chT = t.charAt(i);
        //     count[chT - 'a']--;
        // } 

        // for(int i = 0; i < 26; i++) {
        //     if(count[i] != 0) {
        //         return false;
        //     }
        // }
        // return true;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(int val : map.values()) {
            if(val!=0) {
                return false;
            }
        }
        return true;
    }
}