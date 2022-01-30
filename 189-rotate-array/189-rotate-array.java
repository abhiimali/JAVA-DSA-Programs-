class Solution {
    public void rotate(int[] nums, int k) {
        
    Deque<Integer> q= new ArrayDeque<Integer>();

    for(int i=0;i<nums.length;i++)
    {
        q.add(nums[i]);
    }
     
    for(int i=0;i<k;i++)
    {
       q.push(q.pollLast());   
    }
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=q.pop();
    }
    }
}