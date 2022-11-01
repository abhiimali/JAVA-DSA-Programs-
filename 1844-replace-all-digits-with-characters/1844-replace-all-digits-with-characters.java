class Solution {
    public String replaceDigits(String s) {
     
       char[] str = s.toCharArray() ;
        
       // int i=0 ;
        int n = str.length; 
        
        

        for(int i=1;i<str.length;i++){
            
            if(Character.isDigit(str[i]))
            {
                
                int value = (str[i-1])+(str[i]-'0');
                
                str[i] = (char)value;
                
            }
            
        }
        
            
            
        return new String(str);
        
        
    }
}