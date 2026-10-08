class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            currSum += nums[i];
            maxSum = Math.max(maxSum ,currSum);
            // the overall negative CurrSum will cause subraction so better to make zero as addition of zero doesn't affect to the answer
           if( currSum < 0){
            currSum = 0;
           }
        }
        return maxSum;  
    }
}
