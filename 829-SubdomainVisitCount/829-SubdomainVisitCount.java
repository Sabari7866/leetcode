// Last updated: 9/2/2026, 1:47:00 PM
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        
        for (String domain : cpdomains) {
            int spaceIndex = domain.indexOf(' ');
            int count = Integer.parseInt(domain.substring(0, spaceIndex));
            String currentDomain = domain.substring(spaceIndex + 1);
            
            counts.put(currentDomain, counts.getOrDefault(currentDomain, 0) + count);
            
            
            for (int i = 0; i < currentDomain.length(); i++) {
                if (currentDomain.charAt(i) == '.') {
                    String subdomain = currentDomain.substring(i + 1);
                    counts.put(subdomain, counts.getOrDefault(subdomain, 0) + count);
                }
            }
        }
        
     
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        
        return result;
    }
}