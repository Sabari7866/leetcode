// Last updated: 9/2/2026, 1:46:42 PM
class TimeMap {
    private Map<String, List<int[]>> map; // key -> list of [timestamp, index] but we store value separately
    private Map<String, List<String>> valuesMap;

    public TimeMap() {
        map = new HashMap<>();
        valuesMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new int[]{timestamp});
        valuesMap.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        
        List<int[]> timestamps = map.get(key);
        List<String> values = valuesMap.get(key);
        
        // Binary search for the largest timestamp <= given timestamp
        int left = 0, right = timestamps.size() - 1;
        int resultIndex = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (timestamps.get(mid)[0] <= timestamp) {
                resultIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (resultIndex == -1) {
            return "";
        }
        return values.get(resultIndex);
    }
}