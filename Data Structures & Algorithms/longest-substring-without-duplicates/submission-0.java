class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet();
            set.add(s.charAt(i));

            int count = 1;
            int j = i + 1;
            while ((j < s.length()) && (!set.contains(s.charAt(j)))) {
                set.add(s.charAt(j));
                count++;
                j++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}
