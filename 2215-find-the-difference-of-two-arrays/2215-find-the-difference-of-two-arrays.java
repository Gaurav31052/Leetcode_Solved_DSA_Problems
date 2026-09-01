class Solution {

    static void diff(List<List<Integer>> result, int[] nums1, int[] nums2){
         HashSet<Integer> map = new HashSet<>();
         HashMap<Integer, Integer> check = new HashMap<>();

        for(int i=0;i<nums2.length;i++){
            map.add(nums2[i]);
        }
        List<Integer> temp1 = new ArrayList<>(); 
        for(int i=0;i<nums1.length;i++){
            if(!map.contains(nums1[i])){
                if(!check.containsKey(nums1[i])){
                temp1.add(nums1[i]);
                check.put(nums1[i],1);
                }
                else if(check.containsKey(nums1[i]) && check.get(nums1[i])!=1){
                temp1.add(nums1[i]);
                check.put(nums1[i],1);
                }
            }
            
        }
        result.add(temp1);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result =new ArrayList<>();
       diff(result, nums1, nums2);
       diff(result, nums2, nums1);
        return result;
    }
}