class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, graph, visited, rec)) {
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int course, List<List<Integer>> graph, boolean[] visited, boolean[] rec)  {

        visited[course] = true;
        rec[course] = true;

        for (int i=0; i<graph.get(course).size();i++) {
            int tar = graph.get(course).get(i);

            if (!visited[tar]) {
                if(dfs(tar, graph, visited, rec))
                    return true;
            }
            else if(rec[tar]){
                return true;
            }
        }
        rec[course] = false;

        return false;
    }
}