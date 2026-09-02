# Last updated: 9/2/2026, 1:47:59 PM
class Solution:
    def copyRandomList(self, head):
        if head is None:
            return None

        # HashMap: original node -> copied node
        mp = {}

        # Step 1: Create a copy of every node
        current = head

        while current:
            mp[current] = Node(current.val)
            current = current.next

        # Step 2: Connect next and random pointers
        current = head

        while current:
            mp[current].next = mp.get(current.next)
            mp[current].random = mp.get(current.random)

            current = current.next

        # Return copied head
        return mp[head]