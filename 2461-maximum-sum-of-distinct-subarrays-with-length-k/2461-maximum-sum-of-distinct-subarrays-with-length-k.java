class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
	long maximum = 0;
	long sum = 0;
	
	int i = 0;
	int j = 0;
	
        int n = nums.length ; 
        
	while(j < n){
	  sum += nums[j];
	  map.put(nums[j], map.getOrDefault(nums[j],0) + 1);
	  
	  if(j - i + 1 == k){
	      if(map.size() == k){
	        maximum = Math.max(maximum,sum);   
	      }
	      
	      sum -= nums[i];
	      map.put(nums[i], map.getOrDefault(nums[i],0) - 1);
	      if(map.get(nums[i]) == 0){
	          map.remove(nums[i]);
	      }
	      i++;
	      j++;
	  }
	  else if(j - i + 1 < k){
	      j++;
	  }
	}
	return maximum;
    }
}