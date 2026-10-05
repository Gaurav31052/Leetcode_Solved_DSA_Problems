class Solution {
    public String decodeString(String s) {
        Stack<Integer> digit = new Stack<>();
        Stack<String> st = new Stack<>();
        int i=0;
        while(i!=s.length()){
            if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while(Character.isDigit(s.charAt(i))){
                    num = 10 * num + s.charAt(i) -'0';
                i++;
                }
                digit.push(num);
                
            }
            else if(s.charAt(i) == ']'){
                StringBuilder res = new StringBuilder();
                while(!st.isEmpty() && !st.peek().equals("[") ){
                    res.insert(0,st.pop());
                }
                if(st.peek() !="["){
                    st.pop();
                }
                String num="";
                int n = digit.pop();
                for(int k=0;k<n;k++){
                    num += res;
                }

                st.push(num);
                i++;

            }
            else{
                st.push(Character.toString(s.charAt(i)));
                i++;
            }
        }
        StringBuilder result = new StringBuilder();
        
        while(!st.isEmpty()){
            result.insert(0,st.pop());
        }
    return result.toString();
    }
}

