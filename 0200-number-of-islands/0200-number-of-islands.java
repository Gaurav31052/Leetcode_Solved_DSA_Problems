class Solution {
    public static void markIsland(int a, int b, char[][] grid, boolean[][] visited){
        int n= grid.length;
        int m = grid[0].length;
        Queue<int[]> q =new LinkedList<>();

        q.add(new int[] {a,b});
        visited[a][b] =true;

        while(!q.isEmpty()){

             int[] curr = q.remove();
            int i = curr[0];
            int j= curr[1];

            if(i-1>=0 && grid[i-1][j]== '1' && !visited[i-1][j]){
                q.add(new int[] {i-1,j});
                visited[i-1][j] =true;
            }
            if(i+1<n && grid[i+1][j]== '1' && !visited[i+1][j]){
                q.add(new int[] {i+1,j});
                visited[i+1][j] =true;
            }
            if(j-1>=0 && grid[i][j-1]== '1' && !visited[i][j-1]){
                q.add(new int[] {i,j-1});
                visited[i][j-1] =true;
            }
            if(j+1<m && grid[i][j+1]== '1' && !visited[i][j+1]){
                q.add(new int[] {i,j+1});
                visited[i][j+1] =true;
            }
        }


    }
    public int numIslands(char[][] grid) {

        int n= grid.length;
        int m = grid[0].length;
        int res=0;
        boolean[][] visited = new boolean[n][m];
        for(boolean[] row:visited){
            Arrays.fill(row,false);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    res++;
                    markIsland(i,j,grid,visited);
                } 
            }
        }
        return res;
        
    }
}