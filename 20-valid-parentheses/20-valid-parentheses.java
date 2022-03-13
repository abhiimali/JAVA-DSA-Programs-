class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>(); 
        
        for(char ech : s.toCharArray() )
        {
            
            
            
            if(ech=='(' || ech=='[' || ech=='{' )
            {
                
                stack.push(ech);
            }
            else if(ech==')' && !stack.empty() && stack.peek() == '('  )
            {
               stack.pop() ;
            }
            else if(ech==']'   && !stack.empty() &&  stack.peek() == '['  )
            {
               stack.pop();
            }
            else if(ech=='}'  && !stack.empty() && stack.peek() == '{' )
            {
                stack.pop();
            }
            else
                return false ;

            
        }
        
         return stack.empty() ;
        
    }
}