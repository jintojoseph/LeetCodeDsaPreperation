class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap < Integer , Integer > map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            boolean check = map.containsKey(target - nums[i]);
            if(check){
                int[] ar = new int[2];
                ar[0] = map.get(target - nums[i]);
                ar[1] = i;
                return ar;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
