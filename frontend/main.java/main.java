class Solution {

    // Function to check if a binary tree is balanced
    public boolean isBalanced(Node root) {
        return dfsHeight(root) != -1;
    }
    public int dfsHeight(Node root) {

        if (root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) 
            return -1;

        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) 
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)  
            return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
