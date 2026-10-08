class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int candidate = arr[n-1];
        ans.add(candidate);
        for( int i = n - 2 ; i >= 0 ; i--){
            if(arr[i] >= candidate ){
                ans.add(arr[i]);
                candidate = arr[i];
            }
        }
        
        Collections.reverse(ans);
         return ans;
        
    }
}
