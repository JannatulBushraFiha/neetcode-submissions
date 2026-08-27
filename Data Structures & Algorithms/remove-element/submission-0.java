class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList <Integer> list = new ArrayList <Integer> ();

        int count =0;
        for (int i=0; i< nums.length;i++) {
            if(nums[i]!=val){
                count++;
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
          return list.size();
    }
  
}