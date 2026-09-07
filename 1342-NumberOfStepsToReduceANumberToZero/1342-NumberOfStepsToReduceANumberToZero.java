// Last updated: 9/7/2026, 12:16:37 PM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                count++;
            }
            else{
                num-=1;
                count++;
            }
        }
        return count;
    
    }
    
}    
       
        