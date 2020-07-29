package HOT100;

/**
 * @program: LeetCode *
 * @classname: T4 *
 * @author: lnback *
 * @create: 2020-03-03 17:01
 **/

public class T4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int col = matrix.length - 1;
        int row = 0;
        while (col >= 0 && row <= matrix[0].length - 1) {
            if (target > matrix[col][row]) {
                row++;
            } else if (target < matrix[col][row]) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }
}
