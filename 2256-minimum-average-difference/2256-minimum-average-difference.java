class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        
        long leftSum = 0 , rightSum=0 , sum = 0;
        int id = -1 ;
        int n = nums.length ;
        long diff = 0 ;
        long min = Integer.MAX_VALUE;
        for(int num : nums) sum += num ;
        
        for(int i=0 ; i<nums.length ; i++)
        {
            leftSum = leftSum + nums[i];
            rightSum = sum - leftSum ;
            
diff = Math.abs(leftSum / (i + 1) - (n - i == 1 ? 0 : rightSum / (n -i - 1)));
            if(diff < min)
            {
                min = diff ;
                id = i ;
            }
            
        }
        return id ;
    }
}