class Solution {
    public String reverseWords(String s) {
        
        String temp = "";
        String res = "";

        for(int i=s.length()-1; i>=0;i--){
            if(s.charAt(i) == ' '){
                StringBuilder st = new StringBuilder();
                st.append(temp);
                st.reverse();
                res += st.toString();
                temp = "";
                if(i != 0){
                    res += " ";
                }
            }
            else{
            temp += s.charAt(i);

            }
            
        }
                StringBuilder st = new StringBuilder();
                st.append(temp);
                st.reverse();
                res += st.toString();
                return res.trim().replaceAll("\\s+", " ");

    }
}