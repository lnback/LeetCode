package offer;

/**
 * @program: LeetCode *
 * @classname: T29 *
 * @author: lnback *
 * @create: 2020-07-29 13:06
 **/

public class T29 {
    public int[] spiralOrder(int[][] matrix) {

        int row = matrix.length;
        if(row == 0){
            return new int[0];
        }
        int col = matrix[0].length;
        int[] ans = new int[row * col];
        int index = 0;
        int left = 0,right = col - 1,top = 0,bottom = row - 1;
        while (true){
            for(int i = left ; i <= right ; i++){
                ans[index++] = matrix[top][i];
            }
            if(++top > bottom){
                break;
            }

            for(int i = top ; i <= bottom ; i++){
                ans[index++] = matrix[i++][right];
            }
            if(--right < left) {
                break;
            }
            for(int i = right;i >= left;i--){
                ans[index++] = matrix[bottom][i];
            }
            if(--bottom < top){
                break;
            }
            for(int i = bottom; i >= top;i--){
                ans[index++] = matrix[i][left];
            }
            if(++left > right){
                break;
            }
        }
        return ans;
    }
}
