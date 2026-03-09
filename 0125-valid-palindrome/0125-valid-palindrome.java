class Solution {
    public boolean isPalindrome(String s) {
        // String s2 = s.toLowerCase();
        // String s3 = s2.replaceAll("[^a-zA-Z0-9]", "");
        // int low = 0;
        // int high = s3.length() - 1;

        // while(low <= high) {
        //     if(s3.charAt(low) != s3.charAt(high)) {
        //         return false;
        //     }
        //     low++;
        //     high--;
        // }
        // return true;

        //space optimized

        int low = 0;
        int high = s.length() -1;

        while(low < high) {
            char leftCh = s.charAt(low);
            char rightCh = s.charAt(high);

            if(!Character.isLetterOrDigit(leftCh)) {
                low++;
            }
            else if(!Character.isLetterOrDigit(rightCh)) {
                high--;
            }
            else {
                if(Character.toLowerCase(leftCh) != Character.toLowerCase(rightCh)) {
                    return false;
                }
                low++;
                high--;
            }
            
        }
        return true;
    }
}