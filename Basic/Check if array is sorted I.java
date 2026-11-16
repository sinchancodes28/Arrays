class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
     boolean  isSorted = true;
     for( int e = 0 ; e < n - 1 ; e++){
        if(arr[e] > arr[e+1]){
            isSorted = false;
        }
     }
     return isSorted;
    }
}
