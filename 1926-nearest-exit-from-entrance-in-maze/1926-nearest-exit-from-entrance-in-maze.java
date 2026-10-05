class Solution {
    class pair{
        int i;
        int j;
        int dir;
        public pair(int i,int j, int dir){
            this.i = i;
            this.j = j;
            this.dir = dir;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length-1;
        int m = maze[0].length-1;
        
        Queue<pair> q = new LinkedList<>();

        

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                if(maze[i][j] == '+'){
                    visited[i][j] = true;
                }
            }
        }
        q.add(new pair(entrance[0], entrance[1], 0));
        visited[entrance[0]][entrance[1]] = true;
        int step = Integer.MAX_VALUE;

        while(!q.isEmpty()){
            step++;
            pair curr = q.remove();
            int row = curr.i;
            int col = curr.j;
            int dir = curr.dir;

            

            
                if(row-1>=0  && !visited[row-1][col]){
                    visited[row - 1][col] = true;
                    q.add(new pair(row-1, col, dir+1));
                }
                if(row+1<= n && !visited[row+1][col]){
                    visited[row + 1][col] = true;
                    q.add(new pair(row+1, col, dir+1));
                }
                if(col-1>=0 && !visited[row][col-1]){
                    visited[row][col-1] = true;
                    q.add(new pair(row, col-1, dir+1));
                }
                if(col+1<=m && !visited[row][col+1]){
                    visited[row][col+1] = true;
                    q.add(new pair(row, col+1, dir+1));
                }
            

            if(row != entrance[0] || col != entrance[1]){
                if(row == 0 || row == n || col ==0 || col == m){
                    return dir;
                }
            }
        }
        return -1;

    }
}