package amazon;

public class TreeFromStringArray {
    class Node {
        String value;
        Node left;
        Node right;

        public Node (String value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node tree;

    private void inOrderTraversal (Node head){
        if (head!=null) {
            if (head.left != null) {
                inOrderTraversal(head.left);
            }
            System.out.print(head.value + "  ");
            if (head.right != null) {
                inOrderTraversal(head.right);
            }
        }
    }

    private void treeFromArray(String[] array){
        if(array.length == 0) return;
        tree  = new Node(array[0]);
        for (int i = 1; i < array.length; i++){
            addNode(tree,array[i]);
        }
        inOrderTraversal(tree);
    }
    private void addNode(Node head, String value){
       if (head.value.compareTo(value) > 0){
            if(head.left == null){
                head.left = new Node(value);
                return;
            }
            addNode(head.left, value);
        }else{
            if(head.right == null){
                head.right = new Node(value);
                return;
            }
            addNode(head.right, value);
        }
    }

    public static void main (String[] args){
        TreeFromStringArray test = new TreeFromStringArray();
        String[] array = {"bcd","abc","acd","ac", "adcb","fdc"};
        test.treeFromArray(array);
    }

}
