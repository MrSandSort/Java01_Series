package Tree;

public class Transversal {
    public void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.val +" ");
        inorder(node.right);

    }

    public void preorder(TreeNode node){
        if(node==null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);       
    }

    public void postorder(TreeNode node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val+" ");
    }

    public void levelorder(TreeNode node){
        
    }
}
