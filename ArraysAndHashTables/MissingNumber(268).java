class Solution {
    public int missingNumber(int[] nums) {
        int lastValue = nums.length;
        int sum = lastValue * (lastValue + 1)/2;
        int actualSum = 0;
        for(int n : nums) actualSum += n;
        return sum - actualSum;
    }
}
