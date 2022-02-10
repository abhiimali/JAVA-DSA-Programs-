class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
             int ans=0;
              for(int j=i;j<nums.length;j++){
                  ans+=nums[j];
                  if(ans==k){
                      
                           count++;
                 
                    }
               } 
           }
            return count;
    }
}

//https://leetcode.com/problems/subarray-sum-equals-k/discuss/1532102/JAVA-oror-Picture-%2B-Detail-Explanation-oror-2-methods-oror-prefix-sum-%2B-HashMap-oror-Easy-Solution




