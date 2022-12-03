class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
PriorityQueue<Character> pq = new PriorityQueue<>( (a,b) -> map.get(b) - map.get(a));

        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // now offer pq 
        
        for(char c : map.keySet())
        {
            pq.offer(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
         while(!pq.isEmpty())
         {
             char ch = pq.poll();
             for(int j=0; j< map.get(ch);j++) sb.append(ch);
             
         }
        
        return sb.toString();
    }
}



// Approach  

// 1. Put All character in hashmap with frequency 
// 2. make a priorityQueue With Custome Comparator and sort char on basis of freq 
// 3. pq -> sb 