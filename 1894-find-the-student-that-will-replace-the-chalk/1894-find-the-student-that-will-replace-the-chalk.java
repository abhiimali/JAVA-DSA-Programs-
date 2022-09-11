class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        
        long sum = 0 ;
        for(int i=0 ; i  < chalk.length ; i++) sum += (long) chalk[i];
        
        long rem = k%sum ;
        
        sum = 0 ;
        
        for(int i=0 ;i < chalk.length ; i++)
        {
            sum = sum + (long) chalk[i];
            if(sum > rem )
            {
                return i ;
                
            }
        
            
        }
        
        return chalk.length - 1 ;
    }
}