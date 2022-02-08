class Solution {
    public int addDigits(int n) {
        
        int sum = 0 ;
        
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        
        if(sum<10)
        {
            // 
            
            return sum ;
        }
        
     return   addDigits(sum);
    
    }
}

// RECURSION 

