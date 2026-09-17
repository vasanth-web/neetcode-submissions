class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap();

        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(s);        
        }

        return new ArrayList<>(groups.values());
    }
}
