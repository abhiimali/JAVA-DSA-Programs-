class Solution {
    public long dividePlayers(int[] skill) {
        
        long product = 0 ;
        int n = skill.length ;
        int i=0 , j= skill.length -1   ;
        Arrays.sort(skill);
        
        long constant = skill[0] + skill[n-1];
        while( i<=j)
        {
            if((skill[i]+skill[j]) == constant )
            {
                product = product + (skill[i]*skill[j]);
                
            }
            else
            {
                return -1 ;
            }
            
            i++ ;
            j-- ;
            
        }
         long t = -1 ;
        
        return product ;
    }
}