class Solution {
    public int equalPairs(int[][] grid) {
        int count =0;

        for(int i=0;i<grid.length;i++){
            int[] arr = new int[grid.length];

            for(int j=0;j<grid.length;j++){
                arr[j] = grid[j][i];
            }

            for(int l=0;l<grid.length;l++){
                int temp=0;
                for(int k=0;k<grid.length;k++){
                    if(arr[k]==grid[l][k]){
                        temp++;
                    }
                    else{
                        continue;
                    }
                }
                if(temp==grid.length){
                    count++;
                }
            }
            
           
        }

        return count;
    }
}