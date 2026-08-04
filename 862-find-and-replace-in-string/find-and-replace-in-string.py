class Solution:
    def findReplaceString(self, s, indices, sources, targets):
        match = {}
        for i, idx in enumerate(indices):
            if s.startswith(sources[i], idx):
                match[idx] = i
                
        res = []
        i = 0
        while i < len(s):
            if i in match:
                op_idx = match[i]
                res.append(targets[op_idx])
                i += len(sources[op_idx])
            else:
                res.append(s[i])
                i += 1
                
        return "".join(res)
