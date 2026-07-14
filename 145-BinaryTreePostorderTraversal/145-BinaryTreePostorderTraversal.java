// Last updated: 7/14/2026, 1:54:04 PM
class Solution {
        List<Integer>li=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
      if(root!=null){
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        li.add(root.val);
      }    
      return li;
    }
}