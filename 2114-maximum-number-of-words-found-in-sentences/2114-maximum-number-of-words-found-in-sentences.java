class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maximum  =0 ;
        
        for(String s : sentences)
        {
            String[] str = s.split(" ");
            
            maximum =  Math.max(maximum,str.length);
            
        }
        
        return maximum ;
    }
}