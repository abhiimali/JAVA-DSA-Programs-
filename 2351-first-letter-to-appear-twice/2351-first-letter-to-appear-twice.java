class Solution {
    public char repeatedCharacter(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        for(char c : s.toCharArray())
        {
             if(!set.contains(c))
             {
                 set.add(c);
             }
            else
            {
                return c ;
            }
        }
        return 'a' ;
    }
}