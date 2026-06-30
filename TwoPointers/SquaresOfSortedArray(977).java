class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int left = 0 ;
        int right = nums.length-1;
        int i = nums.length-1;
        while(left < right){
            if((nums[left] * nums[left]) < (nums[right] * nums[right])){
                sortedArray[i] = (nums[right] * nums[right]);
                right--;
                i--;
            }
            else if ((nums[left] * nums[left]) > (nums[right] * nums[right])){
                sortedArray[i] = (nums[left] * nums[left]);
                left++;
                i--;
            }
            else{
                sortedArray[i] = (nums[left] * nums[left]);
                i--; 
                sortedArray[i] = (nums[left] * nums[left]);
                left++;
                right--;
                i--; 
            }
        }
        if(left <= right){
            sortedArray[i] = (nums[left] * nums[left]);
        }
        return sortedArray;
    }
}
