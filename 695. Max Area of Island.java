  class Solution {
      private int height;
      private int width;
      private int res = 0;
      private static int[][] dir = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
      public int maxAreaOfIsland(int[][] grid) {
          if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
          height = grid.length;
          width = grid[0].length;
          for(int i = 0; i < height; i++){
              for(int j = 0; j < width; j++){
                  if(grid[i][j] == 0) continue;
                  res = Math.max(dfs(grid, i, j), res);
              }
          }
          return res;
      }
      private int dfs(int[][] grid, int i, int j){
          int cur = 1;
          grid[i][j] = 0;
          int tx = 0, ty = 0;
          for(int d = 0; d < 4; d++){
              tx = i + dir[d][0];
              ty = j + dir[d][1];
              if(tx >= 0 && tx < height && ty >= 0 && ty < width && grid[tx][ty] == 1){
                  cur += dfs(grid, tx, ty);
              }
          }
          return cur;
      }
  }