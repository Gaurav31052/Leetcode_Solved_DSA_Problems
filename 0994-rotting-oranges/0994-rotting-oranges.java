class Solution {
    
    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        int ans=0;

        boolean[][] visited = new boolean[n][m];

        for(boolean[] row: visited){
        Arrays.fill(row, false);
        }

         Queue<int[]> q = new LinkedList<>();

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    visited[i][j] = true;
                    q.add(new int[] {i,j,0});
                }
            }
         }

         while(!q.isEmpty()){
            int[] curr = q.remove();
            int i = curr[0];
            int j= curr[1];
            int time = curr[2];

            ans = Math.max(ans,time);

            if(i-1>=0 && visited[i-1][j]!=true && grid[i-1][j] ==1 ){
                visited[i - 1][j] = true;
                q.add(new int[] {i-1,j,time+1});
            }
            if(i+1<n && visited[i+1][j]!=true && grid[i+1][j] ==1 ){
                visited[i + 1][j] = true;
                q.add(new int[] {i+1,j,time+1});
            }
            if(j-1>=0 && visited[i][j-1]!=true && grid[i][j-1] ==1 ){
                visited[i][j-1] = true;
                q.add(new int[] {i,j-1,time+1});
            }
            if(j+1<m && visited[i][j+1]!=true && grid[i][j+1] ==1 ){
                visited[i][j+1] = true;
                q.add(new int[] {i,j+1,time+1});
            }
           
         }

          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] ==1 && !visited[i][j]){
                    return -1;
                }
            }
         }

         return ans;

        
    }
}