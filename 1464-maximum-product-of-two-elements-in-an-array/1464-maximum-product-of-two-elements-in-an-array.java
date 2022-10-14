class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int n = nums.length ;
        for(int i=0; i < n ; i++)
        {
            pq.offer(nums[i]);
        }
        
        int x = pq.poll();
        int y = pq.poll();
        
        return (x - 1) * ( y - 1) ;
        
    }
}