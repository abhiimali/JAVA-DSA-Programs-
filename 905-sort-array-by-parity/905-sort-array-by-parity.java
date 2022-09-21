class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i=0 ; i < nums.length ; i++)
        {
            if(nums[i] % 2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
            
            
            
        }
        
       ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(even);
        merge.addAll(odd);
        int[] ans =  new int[merge.size()];
        for(int i = 0 ;i < merge.size() ; i++)
        {
            ans[i] = merge.get(i);
            
        }
        
        return ans ;
    }
}