class Solution {
    public int longestSubarray(int[] nums) {
        int l=0, r=0, del=0,max=0;
        while(r<nums.length){
            if(nums[r]==0){
                del++;
            
            } 
            while(del>1){
                if(nums[l]==0){
                    del--;
                }
            l++;
                
            }
            max = Math.max(max, r-l);
            r++;
        }
        return max;
    }
}

   