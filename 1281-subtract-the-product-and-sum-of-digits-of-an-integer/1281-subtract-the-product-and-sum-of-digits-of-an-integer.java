class Solution {
    public int subtractProductAndSum(int n) {
        
        int k = n ;
        int sum=0;
        int product = 1;
        int digit=0;
        while(k != 0)
        {
            digit = k%10;
            sum = sum+digit;
            product = product * digit;
            k=k/10;
            
        }
        
        
        return product - sum ;
        
  
        
        
    }
}