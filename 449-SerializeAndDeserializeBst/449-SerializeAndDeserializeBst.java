// Last updated: 9/2/2026, 1:47:24 PM
public class Codec {

    
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }

        sb.append(root.val).append(",");

        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        String[] values = data.split(",");
        int[] index = {0};

        return build(values, index, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(String[] values, int[] index, int min, int max) {

        if (index[0] >= values.length || values[index[0]].equals("")) {
            return null;
        }

        int val = Integer.parseInt(values[index[0]]);

       
        if (val < min || val > max) {
            return null;
        }

        index[0]++;

        TreeNode root = new TreeNode(val);

        
        root.left = build(values, index, min, val);

        
        root.right = build(values, index, val, max);

        return root;
    }
}