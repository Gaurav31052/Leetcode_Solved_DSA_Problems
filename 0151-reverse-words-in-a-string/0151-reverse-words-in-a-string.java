class Solution {
    public String reverseWords(String s) {
        StringBuilder st = new StringBuilder();
        String res = "";
        

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)== ' ' && i != 0){
                res += st.reverse();
                res += " ";
                st.delete(0,st.length());
            }
            else{
            st.append(s.charAt(i));
            }
        }
          res += st.reverse();
          return res.trim().replaceAll("\\s+", " ");
    }
}