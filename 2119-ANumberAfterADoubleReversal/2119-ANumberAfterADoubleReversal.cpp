// Last updated: 9/7/2026, 12:16:19 PM
class Solution {
public:
    bool isSameAfterReversals(int num) {
         if (num == 0) {
            return true;
        }
        return (num%10!=0);
    }
};