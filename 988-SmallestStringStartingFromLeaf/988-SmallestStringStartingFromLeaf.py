# Last updated: 9/7/2026, 12:16:50 PM
# LeetCode 988
class Solution:
    def smallestFromLeaf(self, root):
        self.ans = "~"

        def dfs(node, path):
            if not node:
                return

            path = chr(node.val + ord('a')) + path

            if not node.left and not node.right:
                self.ans = min(self.ans, path)

            dfs(node.left, path)
            dfs(node.right, path)

        dfs(root, "")
        return self.ans
        