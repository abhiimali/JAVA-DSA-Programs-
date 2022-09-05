class Solution {
    public int largestAltitude(int[] gain) {
     
        
        int[] prefixSumArray = new int[gain.length+1];
        for ( int i = 0 ; i < gain.length ; i++)
        {
            
            prefixSumArray[i+1] = prefixSumArray[i] + gain[i];
            
            
            
        }
        
        Arrays.sort(prefixSumArray);
        
        return prefixSumArray[prefixSumArray.length-1];
    }
}


