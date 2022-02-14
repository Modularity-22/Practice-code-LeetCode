class Solution {
    public int maxDepth(TreeNode root) {
        return getHeight(root);
    }
    private int getHeight(TreeNode node){
        if(node == null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
