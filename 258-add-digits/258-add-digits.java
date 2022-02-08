class Solution {
    public int addDigits(int num) {
        
//         int sum = 0 ;
        
//         while(n>0)
//         {
//             sum=sum+n%10;
//             n=n/10;
//         }
        
//         if(sum<10)
//         {
           
//             return sum ;
//         }
        
//      return   addDigits(sum);
        
        
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        if(sum<10)
            return sum;
        return addDigits(sum);
    
    }
}

// RECURSION 

