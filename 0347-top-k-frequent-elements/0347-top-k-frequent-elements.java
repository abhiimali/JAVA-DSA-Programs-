class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,1)+1);
        }
        // sort hashmap using stream 
        
  /*      List<Integer> mapSortedByValueDesc  = 
            map.entrySet().stream()
        .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
        .limit(k)
        .map(i -> i.getKey())
        .collect(Collectors.toList());
        
    */    
        // new appproch start
        
Queue<Integer> pq = new PriorityQueue<>((a,b) ->(map.get(a)-map.get(b))); 
        // PQ initialized to sort based on frequency at insertion.
        
        for(int i : map.keySet()){   
            // keyset to get all nums from map keys
            pq.add(i);
            if(pq.size()>k) pq.poll(); 
       // checking if we reached Kth position, then delete the first value(value with least frequency yet encountered)
        }


//         int[] ans = new int[pq.size()];
        
//         for(int j=0; j < pq.size() ; j++)
//             {
//                 ans[j] = pq.poll();
//             }

        return pq.stream().mapToInt(Integer::intValue).toArray();  
    }
}