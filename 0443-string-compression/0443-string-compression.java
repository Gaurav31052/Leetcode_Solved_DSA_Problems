class Solution {
    public int compress(char[] chars) {
    String res ="";
    int count = 0;
    
    if(chars.length == 1){
        return 1;
    }
    res += chars[0];
    char cur = chars[0];

    for(int i=0;i<chars.length;i++){
        if(cur == chars[i]){
            count++;
        }
        else{
            if(count!=1){
                res += Integer.toString(count);
                count=1;
            }
            cur = chars[i];
            res += cur;

        }
    }
    if(count > 1){
    res += count;
}

    for(int i=0;i<res.length();i++){
        chars[i] = res.charAt(i);
    }
    return res.length();
        
    }
}