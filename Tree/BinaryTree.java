package Tree;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(){
        root= null;
    }

    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.root= new TreeNode(10);
        tree.root.left= new TreeNode(5);
        tree.root.right= new TreeNode(15);
        tree.root.left.left= new TreeNode(3);
        tree.root.left.right= new TreeNode(7);
        tree.root.right.right= new TreeNode(20);

        System.out.println("Binary Tree Created");
        System.out.println();


    }
}
