class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int currSum = 0;
        for(int i = 0; i<nums.length; i++){
            currSum += nums[i];
            int rem = 0;
            rem = currSum %k;
            if(map.containsKey(rem)){
                if(i - map.get(rem) > 1) {
                    return true;
                }
            }
            map.putIfAbsent(rem, i);
        }
        return false;
    }
}