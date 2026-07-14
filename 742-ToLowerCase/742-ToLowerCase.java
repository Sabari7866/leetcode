// Last updated: 7/14/2026, 1:53:42 PM
class Solution {
    public String toLowerCase(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32); 
            }
        } 

        String emp = new String(arr);
        System.out.print(emp);
        return emp;  
    }
}
