class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> forS = new HashMap<>();
        // HashMap<Character, Integer> forT = new HashMap<>();

        // if(s.length() != t.length()){
        //     return false;
        // }

        // for(int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     forS.put(ch, forS.getOrDefault(ch, 0) + 1);
        // }
        // for(int i = 0; i < t.length(); i++) {
        //     char ch = t.charAt(i);
        //     forT.put(ch, forT.getOrDefault(ch, 0) + 1);
        // }

        // return forS.equals(forT);

        int[] unicode = new int[26];

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char chS = s.charAt(i);
            unicode[chS - 'a']++;
            char chT = t.charAt(i);
            unicode[chT - 'a']--;
        } 

        for(int i = 0; i < 26; i++) {
            if(unicode[i] != 0) {
                return false;
            }
        }
        return true;
    }
}