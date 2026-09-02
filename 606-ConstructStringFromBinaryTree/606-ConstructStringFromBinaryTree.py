# Last updated: 9/2/2026, 1:47:09 PM
# LeetCode 606
class Solution:
    def tree2str(self, root):
        if not root:
            return ""

        result = str(root.val)

        if root.left:
            result += "(" + self.tree2str(root.left) + ")"

        if root.right:
            if not root.left:
                result += "()"
            result += "(" + self.tree2str(root.right) + ")"

        return result
        