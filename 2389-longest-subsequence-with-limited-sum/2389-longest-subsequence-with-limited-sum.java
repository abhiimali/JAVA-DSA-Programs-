class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<=queries[i])ans[i]+=1;
                else break;
            }
        }
        return ans;
    }
}