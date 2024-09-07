import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeTraversal {
    List<Integer> preorderList = new ArrayList<>();
    List<Integer> postorderList = new ArrayList<>();
    List<Integer> inorderList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            preorderList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return preorderList;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            postorderList.add(root.val);
        }
        return postorderList;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            inorderList.add(root.val);
            inorderTraversal(root.right);
        }
        return inorderList;
    }

    public static void main(String[] args) {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Preorder Traversal: " + binaryTreeTraversal.preorderTraversal(root));
        System.out.println("Postorder Traversal: " + binaryTreeTraversal.postorderTraversal(root));
        System.out.println("Inorder Traversal: " + binaryTreeTraversal.inorderTraversal(root));
    }
}