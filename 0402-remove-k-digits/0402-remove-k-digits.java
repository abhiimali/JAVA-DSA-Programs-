class Solution {
    public String removeKdigits(String num, int k) {
        
   if(num.length()==k) return "0";
        
     Stack<Character> stack = new Stack<>(); 
        
        int i=0;
        int n = num.length() ; 
       while(i < n ) 
           {  
           
           while (k>0 && !stack.isEmpty() && stack.peek() > num.charAt(i) ) 
               {  
               
               stack.pop();
               k--;
            //   i++;
               }
           stack.push(num.charAt(i));
                      i++;
       
           }
        
                      while(k>0)
                      {
                           stack.pop();
                          k--;
                      }
        
    StringBuilder sb = new StringBuilder();
                      
                      for(char ck : stack ) 
                      { 
                          sb.append(ck);
                      }
          
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
    
                       
                   return sb.toString();
    }
}