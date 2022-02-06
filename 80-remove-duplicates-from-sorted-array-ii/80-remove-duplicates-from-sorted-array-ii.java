class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums==null){
        return 0;
    }
 
    if (nums.length <= 2){
        return nums.length;
    }
/*
1,1,1,2,2,3
  i j
*/
    int i = 1; // point to previous
    int j = 2; // point to current
 
    while (j < nums.length) {
        if (nums[j] == nums[i] && nums[j] == nums[i - 1]) {
            j++;
        } else {
            i++;
            nums[i] = nums[j];
            j++;
        }
    }
 
    return i + 1;
    }
}


//https://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-ii-java/