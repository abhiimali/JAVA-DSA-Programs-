class Solution {
    public int fillCups(int[] amount) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : amount)
        {
            pq.add(x);
        }
        int count = 0;
        while(pq.peek() != 0 )
        {
            int x = pq.poll();
            int y = pq.poll();
            
            pq.add(x-1);
            pq.add(y-1);
            count ++ ;
        }
        
        return count ;
    }
}