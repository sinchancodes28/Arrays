class Solution {
    public int removeElement(int[] nums, int val) {
        // take two pointer i and j intiall at the start of array
        // i will traverse the array if the value of  i and val not equal then overwrite the value
        // arr[j] = arr[i]
        // j++ (important)
        // if equal then only i++;
        // in that case j will override the element values that needs to be removed
        int n = nums.length;
        int j = 0;
        for( int i = 0 ; i < n ; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
