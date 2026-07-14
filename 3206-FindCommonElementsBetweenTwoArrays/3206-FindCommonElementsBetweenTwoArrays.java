// Last updated: 7/14/2026, 1:53:19 PM
class Solution {
    public int[] findCommonElements(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) set2.add(num);

        int answer1 = 0;
        for (int num : nums1) if (set2.contains(num)) answer1++;

        int answer2 = 0;
        for (int num : nums2) if (set1.contains(num)) answer2++;

        return new int[]{answer1, answer2};
    }

   
    public int[] findIntersectionValues(int[] param_1, int[] param_2) {
        return findCommonElements(param_1, param_2);
    }
}