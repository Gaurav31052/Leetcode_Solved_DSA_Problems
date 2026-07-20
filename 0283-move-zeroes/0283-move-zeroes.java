class Solution {
    public void moveZeroes(int[] nums) {
        int cur=0;
        int prev = 0;

        for(int i=0;i<nums.length;i++){
            cur = i;
            if(nums[cur] != 0){
                int temp = nums[cur];
                nums[cur] = nums[prev];
                nums[prev] = temp;
                prev++;
                
            }

        }
    }
}