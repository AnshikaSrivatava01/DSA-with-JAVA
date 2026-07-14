class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int n = s.length();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i<n; i++) {
            a[i] = s.charAt(i);
        }
        for (int i = 0; i<n; i++) {
            b[i] = t.charAt(i);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i<n; i++) {
            if(a[i] != b[i]){
                return false;
            }
        }
    return true;
    }
}
