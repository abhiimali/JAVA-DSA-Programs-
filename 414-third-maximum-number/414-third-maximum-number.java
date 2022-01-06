class Solution {
    public int thirdMax(int[] nums) {
        //first sort the array
        Arrays.sort(nums);
        
        //if the array has less then two element then just return the maximum vlaue
        //that is the last index value of the array
                if(nums.length<=2){
            return nums[nums.length-1];
        }
        
        
        //create a variable to store the previos value of the array
        int previous = Integer.MAX_VALUE;
        int count = 0;
        for(int p = nums.length -1; p>=0;p--){
            
            //if the previous element is not equal to the current element 
            //that means distinct(not duplicate) then
            //store it in the previous variable and just increase the count value by one
            if(nums[p]!=previous){
                previous = nums[p];
                count++;
            }
            
            //when the count will be at 3 that means we are now at 
            //third distinct maximum no so return it 
            if(count ==3){
                return previous;
            }
        }
        
        
        //it is for the case like[1,6,6,6,6,6] for this case the return condition 
        //of the above loop will never hit so below is the check for this condition
        //if the array contain duplicate largest value
        if(count >0){
            return nums[nums.length-1];
        }
        
        return previous;
    }
}