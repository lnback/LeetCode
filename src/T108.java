/**
 * @program: LeetCode *
 * @classname: T108 *
 * @author: lnback *
 * @create: 2019-11-19 21:14
 **/

public class T108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return nums == null ? null : buildTree(nums, 0, nums.length - 1);
    }

    private static TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // mid = (left + right) / 2 会溢出
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        return root;
    }
}
