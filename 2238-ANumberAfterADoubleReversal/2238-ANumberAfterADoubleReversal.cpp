// Last updated: 7/14/2026, 1:53:27 PM
class Solution {
public:
    bool isSameAfterReversals(int num) {
         if (num == 0) {
            return true;
        }
        return (num%10!=0);
    }
};