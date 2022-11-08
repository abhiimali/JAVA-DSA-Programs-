class Solution {
    public String makeGood(String s) {
        
        
        Stack<Character> stack = new Stack<>();
        
        char[] arr =  s.toCharArray();
        
        for(int i=0; i < s.length() ; i++)
        {
            
            
            if(stack.isEmpty())
            {
                stack.push(arr[i]);
            }
            else if(Math.abs(arr[i] - stack.peek() ) == 32  )
            {
                stack.pop();
               // continue ;
            }            
            else
            {
                stack.push(arr[i]);
                
            }
            
            
        }
        StringBuilder res = new StringBuilder();
        
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
        
        
        
    }
}