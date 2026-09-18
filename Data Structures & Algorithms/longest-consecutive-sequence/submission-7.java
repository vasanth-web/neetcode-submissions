class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i: nums) set.add(i);

        int longest = 0;
        for (int s: set) {
            if (!set.contains(s - 1)) {
                int num = s;
                int count = 1;

                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
