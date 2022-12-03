class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> map =new HashMap<>();
        
        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int i=0;
        for(char k : s.toCharArray())
        {
            if(map.get(k)==1)
            {
                return i ;
            }
            else
            {
                i++;
            }
        }
        return -1;
    }
}