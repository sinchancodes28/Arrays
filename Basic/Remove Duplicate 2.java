class Solution {
    public int removeDuplicates(int[] nums) {
        // simple two pointer 
        // k and i will intially point to the start element 
        // i will traverse the array if arr[i] == arr[k] just move i till arr[i] != arr[k]
        // when arr[i] != arr[k]
        //increment k++;
        // update k's value that of i
        // return k+1;
        int n = nums.length;
        if( n == 0) return 0;
        int k = 0;
        for( int i = 0 ; i < n ; i++){
            if(nums[i] != nums[k]){
                 k++;
                 nums[k] = nums[i];
            }
        }
        return k+1;
    }
}
