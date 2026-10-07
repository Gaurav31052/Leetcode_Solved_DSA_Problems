class Solution {
    public static void dfs(List<List<int[]>> adj, int u, boolean[] visited, int[] count){
        visited[u] = true;

        for(int[] edge : adj.get(u)){
            
            int v = edge[0]; 
            int k = edge[1];
            if(!visited[v]){
                count[0] += k;
                dfs(adj,v,visited,count);
            }

        }
    }
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= connections.length; i++) { // 'n' is the total number of nodes
            adj.add(new ArrayList<>());
        }
        
        for(int[] i : connections){
            int a = i[0];
            int b = i[1];

            adj.get(a).add(new int[]{b, 1});
            adj.get(b).add(new int[]{a, 0});

        }

        boolean[] visited = new boolean[n];
        int count[] =  {0};

      
        dfs(adj,0,visited,count);
            
        
        return count[0];
        }
}