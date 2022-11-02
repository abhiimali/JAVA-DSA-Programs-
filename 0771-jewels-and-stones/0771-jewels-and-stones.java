class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        
        for(char x : stones.toCharArray())
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int ans = 0 ;
        
        for(int i=0 ; i < jewels.length() ; i++)
        {
            char ch = jewels.charAt(i);
            
            if(map.size() > 0)
            {
                 ans += map.getOrDefault(ch,0);
            }
           
            
    
        }
        
        return ans ; 
    }
    
}