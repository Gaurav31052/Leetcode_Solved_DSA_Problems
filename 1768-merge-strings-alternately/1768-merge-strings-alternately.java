class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length(), word2.length());
        String res="";

        for(int i=0;i<n;i++){
            res += word1.charAt(i);
            res += word2.charAt(i);
        }

        if(word1.length() != n){
            for(int i=n;i<word1.length();i++){
                res += word1.charAt(i);
            }
        }
        else{
            for(int i=n;i<word2.length();i++){
                res += word2.charAt(i);
            
        }
        }
        return res;
        
    }
}