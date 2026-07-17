class Solution {
    public String reverseVowels(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i)) != -1){
                st.push(s.charAt(i));
            }
        }

         for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i)) != -1){
                res.setCharAt(i,st.pop());
            }
            
        }
        return res.toString();
        
    }
}