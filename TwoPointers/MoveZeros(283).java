class Solution {
    public void moveZeroes(int[] nums) {
        int front = 0 ;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[front] = nums[i];
                front++;
            }
        }
        for(int j = front; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}
