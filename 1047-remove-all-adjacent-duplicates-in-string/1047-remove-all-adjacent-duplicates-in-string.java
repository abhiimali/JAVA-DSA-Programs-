class Solution {
    public String removeDuplicates(String s) {
     
        
        Stack<Character> stack = new Stack<>();
        
        for(Character ch : s.toCharArray())
        {
            if(stack.isEmpty())
            {
                stack.push(ch);
            }
            else if(ch == stack.peek())
            {
                stack.pop();
                
            }
            else 
            {
                stack.push(ch);
            }
            
            
        }
        
        String  str = "";
        
        for(char  c : stack) str += c ; 
        
        return str ;
        
        
    }
}