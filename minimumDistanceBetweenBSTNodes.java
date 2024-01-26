class Solution {
    public int minDiffInBST(TreeNode root) {
        int diff = Integer.MAX_VALUE;
        TreeNode prev = null;

        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (prev != null) {
                diff = Math.min(diff, Math.abs(prev.val - root.val));
            }
            prev = root;
            root = root.right;
        }
        return diff;
    }
}
