package offer;

/**
 * @program: LeetCode *
 * @classname: T13 *
 * @author: lnback *
 * @create: 2020-07-16 09:40
 **/

public class T13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);

    }

    private int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n || (i % 10 + i / 10 + j % 10 + j / 10) > k || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
    }
}
