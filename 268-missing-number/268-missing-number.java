class Solution {
    public int missingNumber(int[] nums) {
        
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] ;
            if ( nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }
        /// search for element case 1 N CASE 2

        for (int index = 0 ; index < nums.length ; index++)
        {
            if (nums[index] != index)
            {
                    return  index ;
            }
        }

        return  nums.length ;
        
    }
     void swap(int[] arr, int first, int second) {

            int temp = arr[first];

            arr[first] = arr[second];
            arr[second] = temp;
    }
}