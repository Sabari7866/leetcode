// Last updated: 7/14/2026, 1:53:32 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li=new LinkedList<>();
         int max=0;
        for(int i:candies){
            if(i>max) max=i;
        }
        for(int i:candies){
            if(i+extraCandies>=max) li.add(true);
            else li.add(false);
        }
        return li;
    }
}