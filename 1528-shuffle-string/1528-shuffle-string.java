class Solution {
    public String restoreString(String s, int[] indices) {
        
      //  StringBuilder str = new StringBuilder() ;
        
        int n = indices.length ;
        
        char[] ch = new char[n];
        char[] res = s.toCharArray();
          int i=0;
        for(int x : indices)
        {
            ch[x] = res[i];
            i++;
            
        }
        
        String string = new String(ch);
 
        return string;
        
    }
}