import java.util.LinkedList;
import java.util.Queue;

class treecreation {
    
    public static void main(String args[]) {
        // Example input string: space-separated values, "N" represents a null node
        String s = "1 2 3 N N 4 5";
        
        TreeNode root = treebuild(s);
        
        System.out.print("Inorder Traversal of built tree: ");
        inorder(root);
        System.out.println();
        
        System.out.print("Preorder Traversal of built tree: ");
        preorder(root);
        System.out.println();
        
        System.out.print("Postorder Traversal of built tree: ");
        postorder(root);
        System.out.println();
    }

    // Fixed method signature: Added return type and parameter
    static TreeNode treebuild(String s) {
        // Edge case: Empty string or just "N"
        if (s == null || s.isEmpty() || s.equals("N") || s.equals("null")) {
            return null;
        }

        String[] str = s.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        q.add(root);
        
        int i = 1; // Start reading children from index 1
        
        while (!q.isEmpty() && i < str.length) {
            TreeNode curr = q.poll();
            
            // 1. Process left child
            if (!str[i].equals("N") && !str[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(str[i]));
                q.add(curr.left);
            }
            i++;
            
            // 2. Process right child (Check bounds again in case of uneven string length)
            if (i < str.length && !str[i].equals("N") && !str[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(str[i]));
                q.add(curr.right);
            }
            i++;
        }
        
        return root;
    }

    // Helper method to verify the tree structure
    static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static class TreeNode {
        int data;
        TreeNode left = null;
        TreeNode right = null;
        
        TreeNode(int d) {
            data = d;
        }
    }
}