class Solution {
    public static void dfs(List<List<Integer>> rooms, int source, boolean[] visited){
        visited[source] = true;
        for(int i : rooms.get(source)){
            if(!visited[i]){
                dfs(rooms,i,visited);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms,0,visited);

        for(boolean i : visited){
            if(!i){
                return false;
            }
        }
        return true;
    }
}