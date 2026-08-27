class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <>();
        
        // Handle single element array edge case (e.g., [1])
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++){
            // 1. Calculate and update the count
            int currentCount = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], currentCount);
            
            // 2. Check the variable instead of recalculating
            if (currentCount > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
