class Solution {
    public int mostFrequentElement(int[] nums) {
     HashMap<Integer, Integer> map = new HashMap<>();
     for( int i = 0 ; i < nums.length ; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        else{
            map.put(nums[i] , 1);
        }
     }
     int highFreq = 0;
     int ans = 0;
     for( int i : map.keySet()){
       int CurrFreq =  map.get(i);
       if( map.get(i) > highFreq){
        highFreq = CurrFreq;
        ans = i;
       }
       else if( highFreq == CurrFreq){
              ans = Math.min( ans , i);
       }
     }
     return ans;
    }
}
