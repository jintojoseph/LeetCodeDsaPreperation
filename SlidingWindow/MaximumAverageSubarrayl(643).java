class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0.0;
        double sum = 0.0;
        int front = 0;
        int back = k;
        double result = Double.NEGATIVE_INFINITY;
        for(int i = 0 ; i < k; i++){
            sum += nums[i];
        }
        average = sum/k;
        if(result < average) result = average;
        while(back < nums.length){
            sum += nums[back];
            sum -= nums[front];
            front++;
            back++;
            average = sum/k;
            if(result < average) result = average;
        }
        return result;
    }
}
