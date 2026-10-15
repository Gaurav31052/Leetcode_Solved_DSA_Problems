class Solution {

    public boolean dfs(int curr, List<List<Integer>> graph, boolean[] visited, boolean[] rec, ArrayList<Integer> arr){
        visited[curr] = true;
        rec[curr] = true;

        for(int i=0 ; i<graph.get(curr).size(); i++){
            int tar = graph.get(curr).get(i);

            if(!visited[tar]){
                if(dfs(tar, graph, visited, rec, arr))
                return true;

            }

            else if(rec[tar]){
                return true;
            }
        }
        rec[curr] =false;
        arr.add(curr);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
             graph.add(new ArrayList<>());
        }

        for(int[] p : prerequisites){
            graph.get(p[0]).add(p[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for(int i =0; i<numCourses; i++){
            if(!visited[i]){
             if (dfs(i, graph, visited, rec, arr)) {
                return new int[0];
            }
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}