class Solution {
    public String greatestLetter(String s) {
        
        String ans = "";
    
        HashSet<Character> alphabets = new HashSet<Character>();
        
        for(char ch : s.toCharArray())
        {
            alphabets.add(ch);
        }
            
        for(char alphabet = 'Z'; alphabet >='A'; alphabet -- )
        {
if(alphabets.contains(alphabet) && alphabets.contains((char)('a'+(alphabet-'A'))))
               return ""+alphabet;
        }
        
        return ans ;
    
    }
}