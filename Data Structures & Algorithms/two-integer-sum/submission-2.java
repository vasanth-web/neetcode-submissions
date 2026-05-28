class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        // Inserting first element with index
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            
            // Insert element to the map
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
