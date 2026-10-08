class Solution {
    public int[] rearrangeArray(int[] nums) {
        // make a new array of size n 
        // the pos start with index 0 if num[i] > 0 then place in positive and +2
        // neg start with 1 index if num[i] < 0 then place in negative and -2
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;
        for( int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}
