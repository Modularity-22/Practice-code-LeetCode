class Solution {
    class NodeInfo {
        TreeNode node;
        int pos;

        public NodeInfo(TreeNode node, int pos) {
            this.node = node;
            this.pos = pos;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<NodeInfo> queue = new LinkedList<>();
        queue.add(new NodeInfo(root, 1));

        int start = 0, end = 0, size = 0, maxWidth = 0;

        while (!queue.isEmpty()) {
            size = queue.size();
            start = queue.peek().pos;

            for (int i = 0; i < size; i++) {
                NodeInfo curNodeInfo = queue.remove();
                end = curNodeInfo.pos;

                if (curNodeInfo.node.left != null) {
                    queue.add(new NodeInfo(curNodeInfo.node.left, 2 * end));
                }

                if (curNodeInfo.node.right != null) {
                    queue.add(new NodeInfo(curNodeInfo.node.right, 2 * end + 1));
                }
            }
            maxWidth = Math.max(maxWidth, end - start + 1);
        }
        return maxWidth;
    }
}