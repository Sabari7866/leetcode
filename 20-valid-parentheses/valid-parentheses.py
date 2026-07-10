class Solution:
    def isValid(self, s: str) -> bool:
        mapping: dict[str, str] = {")": "(", "}": "{", "]": "["}
        stack: list[str] = []
        
        for char in s:
            if char in mapping:
                top_element: str = stack.pop() if stack else '#'
                
                if mapping[char] != top_element:
                    return False
            else:
                stack.append(char)
                
       
        return len(stack) == 0