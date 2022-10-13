class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i < score.length ; i++)
        {
            
            pq.add(score[i]);
            
        }
         HashMap<Integer , String> map = new HashMap<>();
        
        String[] ans = new String[score.length];
        int i=1 ;
        while(!pq.isEmpty())
        {
            int  r = pq.poll();
            
            if(i==1)
            {
                map.put(r,"Gold Medal");
            }
            else if(i==2)
            {
                
                map.put(r,"Silver Medal");
            }
            else if(i==3)
            {
                map.put(r,"Bronze Medal");
            }
            else
            {
                map.put(r,Integer.toString(i));
            }
            
            i++;
            
            
            
        }
        
        for(int j=0 ; j < map.size();j++)
        {
            ans[j] = map.get(score[j]);
            
        }
        
        return ans ;
        
    }
}