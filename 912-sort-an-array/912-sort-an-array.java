class Solution {
    public int[] sortArray(int[] nums) {
        
      //  Arrays.sort(nums); 
        
        sort(nums,0,nums.length-1);
        return nums ;

    }
    
    void  sort(int[] nums , int low , int high )
    {
        if (low >= high) {
            return;
        }

        int start = low ;
        int end  = high ;
        int mid = start+(end-start) / 2 ;
        int pivot = nums[mid] ;
        while (start<=end)
        {
            // CODE FOR VOILETION

            while (nums[start] < pivot)
            {
                start ++ ;
            }
            while (nums[end]>pivot)
            {
                end -- ;

            }
            if (start<=end)
            {
                 int temp = nums[start];
                 nums[start]=nums[end];
                 nums[end]=temp;
                 start++;
                 end--;

            }
        }

            sort(nums,low,end);
            sort(nums,start,high);

    }
}