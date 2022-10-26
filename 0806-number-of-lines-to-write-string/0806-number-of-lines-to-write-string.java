class Solution {
    public int[] numberOfLines(int[] widths, String s) {
     
        
        int count=1;
        int sum=0;
        
        for(char i:s.toCharArray()){
            
            if((sum+widths[i-'a'])<=100)sum+=widths[i-'a'];
            
            else {
                
                sum=widths[i-'a'];
                count++;
            }
        }
        
        return new int[]{count,sum};
        
        
    }
}