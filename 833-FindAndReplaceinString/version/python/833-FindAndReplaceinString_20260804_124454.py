# Last updated: 8/4/2026, 12:44:54 PM
1class Solution:
2    def findReplaceString(self, s, indices, sources, targets):
3        match = {}
4        for i, idx in enumerate(indices):
5            if s.startswith(sources[i], idx):
6                match[idx] = i
7                
8        res = []
9        i = 0
10        while i < len(s):
11            if i in match:
12                op_idx = match[i]
13                res.append(targets[op_idx])
14                i += len(sources[op_idx])
15            else:
16                res.append(s[i])
17                i += 1
18                
19        return "".join(res)
20