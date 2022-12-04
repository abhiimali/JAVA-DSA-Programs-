class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
PriorityQueue<Character> pq= new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char c : map.keySet())
            
        {
            pq.offer(c);
            
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty())
        {
            int n = map.get(pq.peek());
            char ck = pq.poll();
            while(n>0)
            {
                sb.append(ck);
                n-- ;
            }
            
        }
        
        return sb.toString();
        
        
    }
}