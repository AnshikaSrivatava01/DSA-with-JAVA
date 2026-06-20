class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int maxLength = 0;
        
        for (int r = 0; r < s.length(); r++) {
            // If a duplicate is found, shrink the window from the left
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            // Add the current character and update the max length
            set.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
        }
        
        return maxLength;
    }
}

