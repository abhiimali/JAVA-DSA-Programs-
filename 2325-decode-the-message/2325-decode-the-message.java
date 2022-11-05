class Solution {
    public String decodeMessage(String key, String message) {
        
        Map<Character, Character> map = new HashMap<>();
        
        char start = 'a';
        
        for(char letter : key.toCharArray() ) 
        {
            
            if(letter != ' ' && !map.containsKey(letter))
            {
                map.put(letter, start++);
            } 
        }

        String res = "";
        for(int i=0; i<message.length(); i++){
            char letter = message.charAt(i);
            if(letter != ' ')
                res += map.get(letter);
            else
                res += ' ';
        }
        return res;  
    }
}