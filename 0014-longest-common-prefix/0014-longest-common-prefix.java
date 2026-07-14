class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        int n = strs.length-1;

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[n].toCharArray();

        for(int i=0; i<first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            res.append(first[i]);
        }
       return res.toString();
    }
}