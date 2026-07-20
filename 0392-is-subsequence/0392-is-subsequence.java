class Solution {
    public boolean isSubsequence(String s, String t) {
        int sb =0;
        int tb =0;

        while (sb < s.length() && tb < t.length()){
            if(s.charAt(sb) == t.charAt(tb)){
                sb++;
            }
            tb++;
        }
         return sb == s.length();
    }
}