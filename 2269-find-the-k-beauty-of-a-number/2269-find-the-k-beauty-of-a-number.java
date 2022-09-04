class Solution {
    public int divisorSubstrings(int num, int k) {
        
        int temp = num ;
        int rem ;
        int count = 0;
        
        List<Integer>  list = new ArrayList<>();
        
        //int value = 0 ;
        while( num  != 0)
        {  
            rem = num % 10 ;
            
            list.add(rem);
            
            num = num / 10 ;
            
        }
        
        Collections.reverse(list);
        
        int n = list.size();
        
       // System.out.println(list);
        
        for(int i=0; i <= n - k ; i++)
        {
            int value = 0;
            
            for(int j = i ; j < i + k ; j++)
            {
                
                value = value * 10 + list.get(j);
                
                
            }
            
            if(value==0)
            {
                continue;
            }
            
            if( temp % value == 0)
            {
                count++ ;
            }
            
            
        }
        
        return count ;
    }
}