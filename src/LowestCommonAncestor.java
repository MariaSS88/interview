/*Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.*/

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p||root==q||root==null) return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left!=null&&right!=null) return root;

        return left==null?right:left;
    }

    /*for BST*/
    public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val>p.val && root.val < q.val) || (root.val<p.val && root.val >q.val) || root == null || root == q || root==p) return root;
        TreeNode node;
        if(root.val > p.val){
            node = lowestCommonAncestor(root.left,p,q);
        } else{
            node = lowestCommonAncestor(root.right,p,q);
        }
        return node;
    }
}
