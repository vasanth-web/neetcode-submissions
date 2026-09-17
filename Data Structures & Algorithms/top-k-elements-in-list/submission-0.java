class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key: map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        // Read the buckets backwards (highest frequency to lowest)
        for (int i = buckets.length - 1; i >= 0 && counter < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[counter++] = num;
                    if (counter == k) break; // Stop once we have k elements
                }
            }
        }

        return result;
    }
}
