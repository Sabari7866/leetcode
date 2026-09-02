# Last updated: 9/2/2026, 1:48:40 PM
1class Solution:
2    def inorderTraversal(self, root):
3        result = []
4
5        def inorder(node):
6            if not node:
7                return
8
9            inorder(node.left)
10            result.append(node.val)
11            inorder(node.right)
12
13        inorder(root)
14        return result