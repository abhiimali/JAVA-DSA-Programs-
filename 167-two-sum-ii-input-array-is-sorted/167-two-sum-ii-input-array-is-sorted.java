class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ans = new int[2];
        
          int  n = numbers.length ;
         int i=0 ; 
        int j= n-1 ;
        boolean check = false ;
        
        while(!check)
        {
            
        
        if(numbers[i] + numbers[j] == target)
        {
            
            ans[0]=i + 1;
            ans[1]=j + 1; 
             check = true ;
        }
        
        if(numbers[i] + numbers[j] < target)
        {
            i++;
        }
        
        if(numbers[i] + numbers[j] > target)
        {
            j--;
        }
        
        }
        
        return ans ;
    }
}