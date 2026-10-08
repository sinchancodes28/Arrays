class Solution {
    public int majorityElement(int[] nums) {
        // boyer - Moore approach 
        int candidate = nums[0];
        int count = 1;
        for( int i = 1 ; i <= nums.length - 1 ; i++){
              if( count == 0){
                candidate = nums[i];
                count++;
              }
              else if(candidate == nums[i]){
                count++;
              }
              else{
                count--;
              }
    }
    return candidate;
}
}
