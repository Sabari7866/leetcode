// Last updated: 9/7/2026, 12:15:59 PM
class Solution {
public:
    int numberOfCuts(int n) {
        if (n==1){
            return 0;
        }
        else if(n%2==0){
            return n/2;
        }
        else{
            return n;
        }
    }
};