class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        int n = s.length() ;
        
        for(int i=0; i< n ; i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '*')
            {
                stack.pop();
                continue ;
            }
            else
            {
                stack.push(ch);
            }
            
            
            
        }
    //    System.out.println(stack);
        String x = ""; for(char c : stack) x += c; return x;

        
        
    }
}