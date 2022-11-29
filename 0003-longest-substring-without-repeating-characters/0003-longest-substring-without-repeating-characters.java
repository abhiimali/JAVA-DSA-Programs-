class Solution {
    public int lengthOfLongestSubstring(String s) {
     int result = 0;
        HashSet<Character> set = new HashSet<>();
        int start=0;
        for(int i=0 ;i < s.length() ; i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(start));
                start++ ;
            }
            set.add(s.charAt(i));
            
            result = Math.max(result,i-start+1);
            
        }
        return result ;
    }
}