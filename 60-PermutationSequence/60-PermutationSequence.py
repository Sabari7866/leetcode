# Last updated: 9/11/2026, 11:51:22 AM
class Solution:
    def getPermutation(self, n, k):
        nums = []

        for i in range(1, n + 1):
            nums.append(i)

        result = ""

        while nums:
            fact = 1

            for i in range(1, len(nums)):
                fact = fact * i

            index = (k - 1) // fact

            result = result + str(nums[index])

            nums.pop(index)

            k = (k - 1) % fact + 1

        return result