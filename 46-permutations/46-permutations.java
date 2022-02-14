class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>> ans = new ArrayList<>();

          permute(ans,nums ,0);
        
        return ans ; 
    }
    
    
    void permute(List<List<Integer>> ans, int[] nums, int start) {


            if (start>= nums.length)
            {
                ans.add(toList(nums));
            }
            else
            {
                for (int index = start ; index < nums.length ; index++) {

                    swap(index,start,nums);
                    permute(ans,nums,start+1);
                    swap(index,start,nums);

                }


            }
    }

     static void swap(int index, int start, int[] nums) {
        int temp = nums[index];
        nums[index] = nums[start];
        nums[start] = temp ;
    }

    static List<Integer> toList(int[] nums) {

        List<Integer> t = new ArrayList<>();

         for (int i: nums) {

             t.add(i);
         }
         return  t ;
    }
}