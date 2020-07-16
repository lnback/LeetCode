package offer;

/**
 * @program: LeetCode *
 * @classname: T12 *
 * @author: lnback *
 * @create: 2020-07-16 09:19
 **/

public class T12 {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0 || word.equals("") || word == null){
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] chs = word.toCharArray();
        for (int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                if(bfs(board,i,j,visited,chs,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean bfs(char[][] board, int i, int j, boolean[][] visited, char[] chs, int index) {
        if(index == chs.length){
            return true;
        }
        if(i < 0 || j < 0 || i == board.length || j == board[0].length || visited[i][j] || board[i][j] != chs[index]){
            return false;
        }
        visited[i][j] = true;
        boolean ans = bfs(board,i + 1,j,visited,chs,index + 1) || bfs(board,i - 1,j,visited,chs,index + 1) || bfs(board,i,j + 1,visited,chs,index + 1) || bfs(board,i,j - 1,visited,chs,index + 1);
        visited[i][j] = false;
        return ans;
    }
}
