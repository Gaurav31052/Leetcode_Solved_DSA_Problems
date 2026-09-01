class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        map.forEach((key, value) -> {set.add(value);});

        if(map.size() == set.size()){
            return true;
        }
        return false;

    }
}