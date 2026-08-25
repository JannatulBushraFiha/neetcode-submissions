class Solution {
    public boolean hasDuplicate(int[] nums) {
        int target =0;
        HashMap <Integer, Integer> map = new HashMap <>();
        for (int i=0; i< nums.length;i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}