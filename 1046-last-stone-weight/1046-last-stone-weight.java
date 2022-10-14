class Solution {
    public int lastStoneWeight(int[] stones) {
     
//         Arrays.sort(stones);
        
//         int[] temp = new int[stones.length];
//         int j=0;
//         for(int i= stones.length-1;i >=0  ; i--)
//         {
//             temp[j++]=stones[i];
//         }
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int n= stones.length ;
       
        for(int i=0;i <n ; i++ )
        {
            pq.offer(stones[i]);
        }
        
        while(pq.size() >  1)
        {
            int y = pq.poll();
            int x = pq.poll();
            
             if(x != y)
            {
                pq.offer(y-x);
            }
            
        }
        
        
        return pq.isEmpty() ? 0 : pq.peek();
    }
}