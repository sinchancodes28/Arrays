class Solution {
    public void nextPermutation(int[] nums) {
    // Pivot find karo
// Pivot se just greater element swap karo
// Pivot ke baad reverse karo 
int n = nums.length;
int pivot = -1;
for( int i = n - 2  ; i >= 0 ; i--){
    if(nums[i] < nums[i+1]){
     pivot = i;
     break;
    }
}
if(pivot != -1){
int next = -1;
for( int i = n-1 ; i > pivot ; i--){
    if(nums[i] > nums[pivot]){
         next = i;
         break;
    }
}
int temp = nums[pivot];
nums[pivot] = nums[next];
nums[next] = temp;

}

int j = pivot + 1;
int k = n -1 ;
swap(j,k,nums); 
    }
    public int[] swap(int i , int j , int[] arr){
        while( i <= j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
        return arr;
    }

}
