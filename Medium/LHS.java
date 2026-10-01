// longest harmonious subsequence
class Solution {
    public int findLHS(int[] nums) {
        // for x  there must be x + 1
        // then count the frequency of x and x+1 and store in ans and return the maximum ans value
        int ans = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for( int num : nums){
            map.put(num ,map.getOrDefault(num , 0) + 1);
        }
        // now check if x exist then x + 1 exist or not and if yes then count their freq and store in ans
        for( int x : map.keySet()){
            if(map.containsKey(x+1)){
                ans = Math.max(ans , map.get(x) + map.get(x+1));
            }
        }
        return ans;
    }
}
