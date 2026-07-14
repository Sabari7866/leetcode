// Last updated: 7/14/2026, 1:53:15 PM
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