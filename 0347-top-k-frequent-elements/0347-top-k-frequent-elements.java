class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,1)+1);
        }
        // sort hashmap using stream 
        
        List<Integer> mapSortedByValueDesc  = 
            map.entrySet().stream()
        .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
        .limit(k)
        .map(i -> i.getKey())
        .collect(Collectors.toList());
        
        


        int[] ans = new int[mapSortedByValueDesc.size()];
        
        for(int j=0; j < mapSortedByValueDesc.size() ; j++)
            {
                ans[j] = mapSortedByValueDesc.get(j);
            }

        return ans ;  
    }
}