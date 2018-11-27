//Given a binary tree, determine if it is a valid binary search tree (BST)
public class ValidBST {
    public static boolean isValidBST(TreeNode root) {
        return isValidNode(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidNode (TreeNode node, long min, long max){
        if(node == null) return true;
        if(node.val <= min || node.val >= max) return false;
        return isValidNode(node.left, min,(long) node.val)&&isValidNode(node.right,(long)node.val,max);
    }
}
