class Solution {
    public boolean closeStrings(String word1, String word2) {

         if (word1.length() != word2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        for(char x: word1.toCharArray()){
            first.put(x,first.getOrDefault(x,0)+1);
        }

        for(char x: word2.toCharArray()){
            second.put(x,second.getOrDefault(x,0)+1);
        }

        if (!first.keySet().equals(second.keySet())) {
            return false;
        }

          ArrayList<Integer> f1 = new ArrayList<>(first.values());
        ArrayList<Integer> f2 = new ArrayList<>(second.values());

        Collections.sort(f1);
        Collections.sort(f2);

        return f1.equals(f2);

        


    }
}