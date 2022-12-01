class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     
        
        List<int[]> list = new ArrayList<>();
        
    
        for(int[] i : intervals)
        {
           if(newInterval[1] < i[0])
            {
                list.add(newInterval);
                newInterval = i;
            } 
            
             else if(i[1] < newInterval[0])
            {
                list.add(i);
            } 
            else {
                newInterval[0] = Math.min(newInterval[0],i[0]);
                newInterval[1] = Math.max(newInterval[1],i[1]);
            }
             
            
        }
         
        list.add(newInterval);
       return   list.toArray(new int[0][]);
    }
}